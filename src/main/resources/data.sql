INSERT INTO public.userlessons (
id, numberofremaininglessons, userid) VALUES (
'1'::integer, '20'::integer, '1'::integer)
 returning id;
 INSERT INTO public.userlessons (
 id, numberofremaininglessons, userid) VALUES (
 '2'::integer, '9'::integer, '2'::integer)
  returning id;
COMMIT;

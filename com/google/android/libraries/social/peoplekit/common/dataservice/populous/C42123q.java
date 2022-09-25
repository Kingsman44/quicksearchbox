package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.populous.C42200be;
import com.google.android.libraries.social.populous.C42201bf;
import com.google.android.libraries.social.populous.C42595p;
import com.google.android.libraries.social.populous.C42598s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.q */
/* compiled from: PG */
final class C42123q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C42126t f110181a;

    public C42123q(C42126t tVar) {
        this.f110181a = tVar;
    }

    public final void run() {
        Cursor cursor;
        HashMap hashMap;
        int i;
        String str;
        String str2;
        String str3;
        PopulousPerson populousPerson;
        C42126t tVar = this.f110181a;
        Uri build = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build();
        if (((PeopleKitConfigImpl) tVar.f110197i).f110248o) {
            cursor = tVar.f110193e.getContentResolver().query(build, C42126t.f110189a, C42126t.f110190b, (String[]) null, "sort_key ASC");
        } else {
            cursor = tVar.f110193e.getContentResolver().query(build, C42126t.f110189a, C42126t.f110191c, (String[]) null, "sort_key ASC");
        }
        HashMap hashMap2 = new HashMap();
        String[] stringArray = cursor.getExtras().getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
        int[] intArray = cursor.getExtras().getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
        int i2 = 0;
        for (int i3 = 0; i3 < stringArray.length; i3++) {
            hashMap2.put(Integer.valueOf(i2), stringArray[i3]);
            i2 += intArray[i3];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<C42125s> arrayList = new ArrayList<>();
        String str4 = BuildConfig.FLAVOR;
        while (cursor.moveToNext()) {
            if (hashMap2.containsKey(Integer.valueOf(cursor.getPosition()))) {
                str4 = (String) hashMap2.get(Integer.valueOf(cursor.getPosition()));
            }
            String a = C42126t.m73917a(cursor, "mimetype");
            if ("vnd.android.cursor.item/email_v2".equals(a)) {
                str = C42126t.m73917a(cursor, "data1");
                if (!((PeopleKitConfigImpl) tVar.f110197i).f110243j || str.toLowerCase(Locale.US).endsWith("@gmail.com") || str.toLowerCase(Locale.US).endsWith("@googlemail.com") || str.toLowerCase(Locale.US).endsWith("@google.com")) {
                    i = 1;
                } else {
                    hashMap = hashMap2;
                    hashMap2 = hashMap;
                }
            } else if ("vnd.android.cursor.item/phone_v2".equals(a)) {
                str = C42126t.m73917a(cursor, "data1");
                i = 2;
            } else {
                str = null;
                i = 0;
            }
            if (i == 0 || TextUtils.isEmpty(str)) {
                hashMap = hashMap2;
                if (Log.isLoggable("DeviceContactLoader", 3)) {
                    Log.d("DeviceContactLoader", "Device contact row of unknown type");
                }
                hashMap2 = hashMap;
            } else {
                int parseInt = Integer.parseInt(cursor.getString(((Integer) C42126t.f110192d.get("display_name_source")).intValue()));
                if (parseInt == 40 || parseInt == 35 || parseInt == 30) {
                    str3 = C42126t.m73917a(cursor, "display_name");
                    str2 = C42096f.m73798c(str3);
                } else {
                    str3 = BuildConfig.FLAVOR;
                    str2 = str3;
                }
                String a2 = C42126t.m73917a(cursor, "photo_thumb_uri");
                String a3 = C42126t.m73917a(cursor, "contact_id");
                String a4 = C42126t.m73917a(cursor, "lookup");
                C42111e eVar = new C42111e();
                hashMap = hashMap2;
                eVar.f110129a = 4;
                eVar.f110130b = str;
                eVar.f110131c = i;
                eVar.mo44728b(str3, true, false);
                eVar.f110138j = str2;
                eVar.f110139k = a2;
                eVar.f110141m = str4;
                eVar.f110142n = false;
                if (((PeopleKitConfigImpl) tVar.f110197i).f110250q) {
                    C42130x xVar = new C42130x();
                    xVar.f110201b = a3;
                    xVar.f110202c = a4;
                    populousPerson = new PopulousPerson(xVar);
                } else {
                    populousPerson = null;
                }
                eVar.f110152x = populousPerson;
                eVar.f110147s = a3;
                eVar.f110148t = a4;
                PopulousChannel a5 = eVar.mo44727a();
                Set set = (Set) linkedHashMap.get(a3);
                if (set == null) {
                    set = new LinkedHashSet();
                    linkedHashMap.put(a3, set);
                }
                set.add(a5);
                if (((PeopleKitConfigImpl) tVar.f110197i).f110247n) {
                    arrayList.add(new C42125s(a3, a5));
                }
                if (C42126t.m73917a(cursor, "starred").equals("1")) {
                    Set set2 = (Set) linkedHashMap2.get(a3);
                    if (set2 == null) {
                        set2 = new LinkedHashSet();
                        linkedHashMap2.put(a3, set2);
                    }
                    eVar.f110141m = BuildConfig.FLAVOR;
                    eVar.f110142n = true;
                    set2.add(eVar.mo44727a());
                }
                hashMap2 = hashMap;
            }
        }
        cursor.close();
        HashSet hashSet = new HashSet();
        HashMap hashMap3 = new HashMap();
        for (C42125s sVar : arrayList) {
            if (hashSet.add(sVar.f110188c)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(sVar);
                hashMap3.put(sVar.f110188c, arrayList2);
            } else {
                ((List) hashMap3.get(sVar.f110188c)).add(sVar);
            }
        }
        C42598s sVar2 = tVar.f110195g;
        ArrayList arrayList3 = new ArrayList(hashSet);
        C42200be f = C42201bf.m74161f();
        f.mo44895b(true);
        ((C42595p) f).f111772c = 1;
        f.mo44894a();
        sVar2.mo44864d(arrayList3, new C42124r(tVar, hashMap3, linkedHashMap2, linkedHashMap));
    }
}

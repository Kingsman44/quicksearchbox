package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o */
/* compiled from: PG */
public final class C113318o implements C113306c {

    /* renamed from: a */
    public static final C59071e f313806a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o");

    /* renamed from: b */
    public static final Intent f313807b = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:1234567"));

    /* renamed from: c */
    public static final Intent f313808c = new Intent("android.intent.action.CALL", Uri.parse("tel:1234567"));

    /* renamed from: d */
    public static final String[] f313809d;

    /* renamed from: e */
    public static final C58495hd f313810e;

    /* renamed from: f */
    public static final String f313811f = String.format("%s = ?", new Object[]{"contact_id"});

    /* renamed from: g */
    public static final String f313812g = String.format("%s LIKE ?", new Object[]{"display_name"});

    /* renamed from: k */
    private static final C58827ar f313813k;

    /* renamed from: l */
    private static final C58485gu f313814l;

    /* renamed from: m */
    private static final List f313815m;

    /* renamed from: n */
    private static final C58485gu f313816n;

    /* renamed from: o */
    private static final C58485gu f313817o;

    /* renamed from: p */
    private static final C58485gu f313818p;

    /* renamed from: q */
    private static final String f313819q = String.format("%s = 'vnd.android.cursor.item/phone_v2' AND %s = ?", new Object[]{"mimetype", "contact_id"});

    /* renamed from: h */
    public final C68214a f313820h;

    /* renamed from: i */
    public final C68214a f313821i;

    /* renamed from: j */
    public final C22871g f313822j;

    /* renamed from: r */
    private final Context f313823r;

    /* renamed from: s */
    private final C68214a f313824s;

    /* renamed from: t */
    private final C68214a f313825t;

    static {
        C58827ar arVar = new C58827ar(", ");
        f313813k = arVar;
        C58485gu s = C58485gu.m89851s("_id", "contact_id", "raw_contact_id", "lookup", "data1", "mimetype");
        f313814l = s;
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(s);
        e.mo55395g("account_type_and_data_set");
        C58485gu f = e.mo55394f();
        f313815m = f;
        C58480gp e2 = C58485gu.m89837e();
        e2.mo55396h(f);
        e2.mo55395g("times_used");
        e2.mo55395g("last_time_used");
        C58485gu f2 = e2.mo55394f();
        f313816n = f2;
        f313817o = f2;
        C58480gp e3 = C58485gu.m89837e();
        e3.mo55396h(f2);
        e3.mo55395g("data2");
        e3.mo55395g("account_name");
        e3.mo55395g("account_type");
        e3.mo55395g("display_name");
        e3.mo55395g("photo_uri");
        e3.mo55395g("starred");
        e3.mo55395g("is_super_primary");
        C58485gu f3 = e3.mo55394f();
        f313818p = f3;
        String[] strArr = (String[]) f3.toArray(new String[0]);
        f313809d = strArr;
        Pattern.compile(String.format("%s([^/]+)(/.*)?", new Object[]{"content://com.android.contacts/contacts/lookup/"}));
        arVar.mo56097d(C58597ky.m90217h(C58485gu.m89848p("vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", "vnd.android.cursor.item/postal-address_v2"), new C113316m()));
        String.format("%s DESC LIMIT 0, 800", new Object[]{"_id"});
        C58490gz gzVar = new C58490gz(4);
        for (int i = 0; i < strArr.length; i++) {
            gzVar.mo55429h(strArr[i], Integer.valueOf(i));
        }
        f313810e = C58495hd.m89898l(gzVar.mo55427f(false));
    }

    public C113318o(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar, C68214a aVar4) {
        this.f313823r = context;
        this.f313820h = aVar;
        this.f313824s = aVar2;
        this.f313821i = aVar3;
        this.f313822j = gVar;
        this.f313825t = aVar4;
    }

    /* renamed from: c */
    public static void m187470c(Map map, C113321r rVar) {
        List list = (List) map.get(rVar.f313838e);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(rVar);
        map.put(rVar.f313838e, list);
    }

    /* renamed from: g */
    private final String m187471g(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String stripSeparators = PhoneNumberUtils.stripSeparators(PhoneNumberUtils.convertKeypadLettersToDigits(str));
        if (!TextUtils.isEmpty(stripSeparators)) {
            String simCountryIso = ((TelephonyManager) this.f313823r.getSystemService("phone")).getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso) && Locale.getDefault() != null) {
                simCountryIso = Locale.getDefault().getCountry();
            }
            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(stripSeparators, TextUtils.isEmpty(simCountryIso) ? "US" : simCountryIso.toUpperCase(Locale.US));
            if (!TextUtils.isEmpty(formatNumberToE164)) {
                return formatNumberToE164;
            }
        }
        return stripSeparators;
    }

    /* renamed from: a */
    public final List mo100109a(String str, C113320q qVar) {
        ArrayList arrayList = new ArrayList();
        if (!mo100113f()) {
            C59104x d = f313806a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "contactInfoFetcher");
            ((C59052c) ((C59052c) d).mo56372aa(27855)).mo56386p("No READ_CONTACTS permission granted.");
            return arrayList;
        }
        Cursor query = ((ContentResolver) this.f313820h.mo27525b()).query(ContactsContract.Data.CONTENT_URI, f313809d, f313819q, new String[]{str}, (String) null);
        if (query != null) {
            try {
                if (query.getCount() != 0) {
                    while (query.moveToNext()) {
                        C58495hd hdVar = f313810e;
                        if (TextUtils.equals("com.google", C113317n.m187469b("account_type", query, hdVar))) {
                            Optional b = mo100110b(query, hdVar, qVar);
                            if (b.isPresent()) {
                                arrayList.add((C113321r) b.get());
                            }
                        }
                    }
                    return arrayList;
                }
            } finally {
                query.close();
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    /* renamed from: b */
    public final Optional mo100110b(Cursor cursor, Map map, C113320q qVar) {
        String str;
        String str2;
        String a;
        String str3;
        String b = C113317n.m187469b("data1", cursor, map);
        String b2 = C113317n.m187469b("mimetype", cursor, map);
        String b3 = C113317n.m187469b("account_type", cursor, map);
        boolean z = true;
        boolean z2 = C113317n.m187468a("starred", cursor, map) == 1;
        if (C113317n.m187468a("is_super_primary", cursor, map) != 1) {
            z = false;
        }
        if ((!"vnd.android.cursor.item/phone_v2".equals(b2) && !C113305b.f313795a.contains(b2)) || !C113305b.f313796b.contains(b3)) {
            return Optional.empty();
        }
        C113319p pVar = (C113319p) C113321r.f313832n.createBuilder();
        if (b.endsWith("@s.whatsapp.net")) {
            str = m187471g(b.substring(0, b.length() - 15));
        } else {
            str = m187471g(b);
        }
        String b4 = C113317n.m187469b("_id", cursor, map);
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313841h = b4;
        String b5 = C113317n.m187469b("contact_id", cursor, map);
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313838e = b5;
        String b6 = C113317n.m187469b("display_name", cursor, map);
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313834a = b6;
        pVar.copyOnWrite();
        str.getClass();
        ((C113321r) pVar.instance).f313835b = str;
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313837d = qVar.getNumber();
        String b7 = C113317n.m187469b("photo_uri", cursor, map);
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313836c = b7;
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313839f = b2;
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313840g = b3;
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313845l = z2;
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313846m = z;
        String str4 = null;
        if (TextUtils.equals(b3, "com.google")) {
            if (qVar == C113320q.TEXT) {
                str3 = C58837ba.m90858g(((C113324u) this.f313824s.mo27525b()).mo100117c(f313807b));
            } else {
                str3 = qVar == C113320q.CALL ? C58837ba.m90858g(((C113324u) this.f313824s.mo27525b()).mo100117c(f313808c)) : null;
            }
            int a2 = C113317n.m187468a("data2", cursor, map);
            if (!(a2 == -1 || a2 == 0)) {
                str4 = ContactsContract.CommonDataKinds.Phone.getTypeLabel(this.f313823r.getResources(), a2, (CharSequence) null).toString();
            }
            str2 = str4;
            str4 = str3;
        } else {
            String str5 = "com.whatsapp";
            if (TextUtils.equals(b3, str5)) {
                a = ((C113324u) this.f313824s.mo27525b()).mo100115a(str5);
            } else {
                str5 = "org.telegram.messenger";
                if (TextUtils.equals(b3, str5)) {
                    a = ((C113324u) this.f313824s.mo27525b()).mo100115a(str5);
                } else {
                    str2 = null;
                }
            }
            String str6 = a;
            str4 = str5;
            str2 = str6;
        }
        if (str4 == null) {
            return Optional.empty();
        }
        if (str2 != null) {
            pVar.copyOnWrite();
            ((C113321r) pVar.instance).f313842i = str2;
        }
        String b8 = ((C113324u) this.f313824s.mo27525b()).mo100116b(str4);
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313843j = str4;
        pVar.copyOnWrite();
        ((C113321r) pVar.instance).f313844k = b8;
        return Optional.m71637of((C113321r) pVar.build());
    }

    /* renamed from: d */
    public final boolean mo100111d(String str) {
        return ((C86124t) this.f313825t.mo27525b()).mo79745c(C90063do.f249299as).contains(str);
    }

    /* renamed from: e */
    public final boolean mo100112e(String str) {
        return ((C86124t) this.f313825t.mo27525b()).mo79745c(C90063do.f249300at).contains(str);
    }

    /* renamed from: f */
    public final boolean mo100113f() {
        return C91077d.m148794e(this.f313823r, "android.permission.READ_CONTACTS");
    }
}

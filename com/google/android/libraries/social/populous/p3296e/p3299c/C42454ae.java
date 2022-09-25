package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import androidx.core.content.C1882h;
import androidx.p060c.C0981k;
import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42417an;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42418ao;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42428g;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42440s;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42442u;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58735qa;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayList;
import java.util.Collection;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69311s;

/* renamed from: com.google.android.libraries.social.populous.e.c.ae */
/* compiled from: PG */
public final class C42454ae {

    /* renamed from: a */
    public static final String f111366a = "ae";

    /* renamed from: b */
    public static final String f111367b = String.format("%s ASC", new Object[]{"sort_key"});

    /* renamed from: c */
    public static final String[] f111368c = {"contact_id"};

    /* renamed from: d */
    public static final String[] f111369d;

    /* renamed from: e */
    private static final String f111370e = String.format("%s DESC, %s DESC, %s DESC", new Object[]{"starred", "times_contacted", "last_time_contacted"});

    /* renamed from: f */
    private static final String f111371f = String.format("%s DESC, %s DESC, %s DESC LIMIT 0, 200", new Object[]{"starred", "times_contacted", "last_time_contacted"});

    private C42454ae() {
    }

    /* renamed from: a */
    static int m74848a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    static long m74849b(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: c */
    static C58485gu m74850c(Context context, String str, Uri uri, C42591z zVar, C42576k kVar) {
        Cursor m = m74860m(context, uri.buildUpon().appendPath(str).appendQueryParameter("directory", "0").build(), f111368c, (String) null, (String[]) null, (String) null, zVar, kVar);
        if (m == null) {
            return C58485gu.m89845m();
        }
        try {
            C58480gp f = C58485gu.m89838f(m.getCount());
            while (m.moveToNext()) {
                f.mo55395g(Long.valueOf(m74849b(m, "contact_id")));
            }
            C58485gu f2 = f.mo55394f();
            m.close();
            return f2;
        } catch (Throwable th) {
            C42452ac.m74844a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public static C58485gu m74851d(Context context, String str, ClientConfigInternal clientConfigInternal, C42403a aVar, C42591z zVar, C42576k kVar) {
        String str2;
        if (!C58837ba.m90859h(str)) {
            str2 = f111370e;
        } else {
            str2 = f111371f;
        }
        return m74852e(context, str, clientConfigInternal, aVar, zVar, kVar, str2);
    }

    /* renamed from: e */
    public static C58485gu m74852e(Context context, String str, ClientConfigInternal clientConfigInternal, C42403a aVar, C42591z zVar, C42576k kVar, String str2) {
        C58541iw iwVar;
        String[] strArr;
        Throwable th;
        String str3;
        C58485gu guVar;
        C58485gu guVar2;
        Context context2 = context;
        String str4 = str;
        ClientConfigInternal clientConfigInternal2 = clientConfigInternal;
        C42403a aVar2 = aVar;
        C42591z zVar2 = zVar;
        C42576k kVar2 = kVar;
        if (!C58837ba.m90859h(str)) {
            C58528ij ijVar = clientConfigInternal2.f110725k;
            C58539iu Q = C58541iw.m90066Q();
            if (ijVar.contains(C42262ao.PHONE_NUMBER)) {
                Q.mo55535n(m74850c(context2, str4, ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, zVar2, kVar2));
            }
            if (ijVar.contains(C42262ao.EMAIL)) {
                Q.mo55535n(m74850c(context2, str4, ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, zVar2, kVar2));
            }
            iwVar = Q.mo55486f();
            if (iwVar.isEmpty()) {
                return C58485gu.m89845m();
            }
        } else {
            iwVar = null;
        }
        C58541iw iwVar2 = iwVar;
        C58528ij ijVar2 = clientConfigInternal2.f110725k;
        ArrayList arrayList = new ArrayList(6);
        arrayList.add("vnd.android.cursor.item/name");
        arrayList.add("vnd.android.cursor.item/postal-address_v2");
        arrayList.add("vnd.android.cursor.item/nickname");
        arrayList.add("vnd.android.cursor.item/contact_event");
        if (ijVar2.contains(C42262ao.EMAIL)) {
            arrayList.add("vnd.android.cursor.item/email_v2");
        }
        if (ijVar2.contains(C42262ao.PHONE_NUMBER)) {
            arrayList.add("vnd.android.cursor.item/phone_v2");
        }
        StringBuilder sb = new StringBuilder("mimetype IN (?");
        for (int i = 1; i < arrayList.size(); i++) {
            sb.append(",?");
        }
        sb.append(")");
        if (m74861n(iwVar2)) {
            sb.append(" AND contact_id IN (?");
            for (int i2 = 1; i2 < ((C58735qa) iwVar2).f156507e.size(); i2++) {
                sb.append(",?");
            }
            sb.append(")");
        }
        String sb2 = sb.toString();
        if (m74861n(iwVar2)) {
            Collection[] collectionArr = {arrayList, iwVar2};
            int i3 = 0;
            for (int i4 = 0; i4 < 2; i4++) {
                i3 += collectionArr[i4].size();
            }
            String[] strArr2 = new String[i3];
            int i5 = 0;
            for (int i6 = 0; i6 < 2; i6++) {
                for (Object obj : collectionArr[i6]) {
                    strArr2[i5] = obj.toString();
                    i5++;
                }
            }
            strArr = strArr2;
        } else {
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        Cursor m = m74860m(context, ContactsContract.Data.CONTENT_URI, f111369d, sb2, strArr, str2, zVar, kVar);
        if (m == null) {
            return C58485gu.m89845m();
        }
        try {
            ArrayList<C42453ad> arrayList2 = new ArrayList<>(m.getCount());
            C0981k kVar3 = new C0981k(m.getCount());
            while (m.moveToNext()) {
                long b = m74849b(m, "contact_id");
                if (iwVar2 == null || iwVar2.contains(Long.valueOf(b))) {
                    C42453ad adVar = (C42453ad) kVar3.mo3678e(b);
                    if (adVar == null) {
                        C42453ad adVar2 = new C42453ad(m, clientConfigInternal2, aVar2);
                        arrayList2.add(adVar2);
                        kVar3.mo3682i(b, adVar2);
                    } else {
                        adVar.mo45499a(m, clientConfigInternal2, aVar2);
                    }
                }
            }
            C58480gp f = C58485gu.m89838f(arrayList2.size());
            for (C42453ad adVar3 : arrayList2) {
                C42456ag agVar = adVar3.f111363d;
                C58485gu j = C58485gu.m89842j(adVar3.f111362c);
                if (j != null) {
                    ((C42496w) agVar).f111444c = j;
                    C58485gu j2 = C58485gu.m89842j(adVar3.f111361b);
                    if (j2 != null) {
                        ((C42496w) agVar).f111446e = j2;
                        C42417an anVar = adVar3.f111364e;
                        ((C42428g) anVar).f111308n = Integer.valueOf(adVar3.f111361b.size());
                        ((C42428g) anVar).f111309o = Integer.valueOf(adVar3.f111360a.size());
                        C42418ao a = anVar.mo45416a();
                        if (a != null) {
                            ((C42496w) agVar).f111447f = a;
                            C42456ag agVar2 = adVar3.f111363d;
                            if (!(((C42496w) agVar2).f111448g != 1 || (str3 = ((C42496w) agVar2).f111443b) == null || (guVar = ((C42496w) agVar2).f111444c) == null || (guVar2 = ((C42496w) agVar2).f111446e) == null)) {
                                C42418ao aoVar = ((C42496w) agVar2).f111447f;
                                if (aoVar != null) {
                                    f.mo55395g(new C42497x(((C42496w) agVar2).f111442a, str3, guVar, ((C42496w) agVar2).f111445d, guVar2, aoVar));
                                }
                            }
                            StringBuilder sb3 = new StringBuilder();
                            if (((C42496w) agVar2).f111448g == 0) {
                                sb3.append(" deviceContactId");
                            }
                            if (((C42496w) agVar2).f111443b == null) {
                                sb3.append(" deviceLookupKey");
                            }
                            if (((C42496w) agVar2).f111444c == null) {
                                sb3.append(" displayNames");
                            }
                            if (((C42496w) agVar2).f111446e == null) {
                                sb3.append(" fields");
                            }
                            if (((C42496w) agVar2).f111447f == null) {
                                sb3.append(" rankingFeatureSet");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                        }
                        throw new NullPointerException("Null rankingFeatureSet");
                    }
                    throw new NullPointerException("Null fields");
                }
                throw new NullPointerException("Null displayNames");
            }
            C58485gu f2 = f.mo55394f();
            C58801sm G = f2.listIterator(0);
            while (G.hasNext()) {
                C42457ah ahVar = (C42457ah) G.next();
                if (ahVar.mo45501b() != null) {
                    C58801sm G2 = ahVar.mo45504e().listIterator(0);
                    while (G2.hasNext()) {
                        ((C42442u) G2.next()).mo45465c().f110788e = true;
                    }
                    C58801sm G3 = ahVar.mo45503d().listIterator(0);
                    while (G3.hasNext()) {
                        ((C42440s) G3.next()).mo44976b().f110788e = true;
                    }
                }
            }
            m.close();
            return f2;
        } catch (RuntimeException e) {
            Log.e(f111366a, "Error while parsing contact data.", e);
            C42579n a2 = zVar.mo45631a(kVar);
            a2.mo45673h(25);
            a2.mo45674i(4);
            a2.mo45670e(e);
            a2.mo45672g(8);
            a2.mo45666a();
            throw e;
        } catch (Throwable th2) {
            C42452ac.m74844a(th, th2);
        }
        throw th;
    }

    /* renamed from: f */
    static String m74853f(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: g */
    static boolean m74854g(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0;
    }

    /* renamed from: h */
    public static boolean m74855h(Context context) {
        try {
            return C1882h.m5137c(context, "android.permission.READ_CONTACTS") == 0;
        } catch (RuntimeException e) {
            Log.e(f111366a, "Error checking read contacts permission.", e);
            return false;
        }
    }

    /* renamed from: i */
    static boolean m74856i(Cursor cursor, String str) {
        return cursor.isNull(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: j */
    static int m74857j(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    /* renamed from: k */
    static long m74858k(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("last_time_used");
        if (columnIndex == -1) {
            return 0;
        }
        return cursor.getLong(columnIndex);
    }

    /* renamed from: l */
    static String m74859l(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("data4");
        if (columnIndex == -1) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    /* renamed from: m */
    private static Cursor m74860m(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C42591z zVar, C42576k kVar) {
        try {
            return context.getContentResolver().query(uri, strArr, str, strArr2, str2);
        } catch (RuntimeException e) {
            C42579n a = zVar.mo45631a(kVar);
            a.mo45673h(24);
            a.mo45674i(4);
            a.mo45670e(e);
            a.mo45666a();
            return null;
        }
    }

    /* renamed from: n */
    private static boolean m74861n(Collection collection) {
        return collection != null && ((long) ((C58735qa) collection).f156507e.size()) <= C69311s.f185465a.mo60999b().mo61000a();
    }

    static {
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("contact_id");
        ihVar.mo55373c("raw_contact_id");
        ihVar.mo55373c("lookup");
        ihVar.mo55373c("mimetype");
        ihVar.mo55373c("is_primary");
        ihVar.mo55373c("is_super_primary");
        ihVar.mo55373c("account_type");
        ihVar.mo55373c("account_name");
        ihVar.mo55373c("times_used");
        ihVar.mo55373c("last_time_used");
        ihVar.mo55373c("starred");
        ihVar.mo55373c("pinned");
        ihVar.mo55373c("times_contacted");
        ihVar.mo55373c("last_time_contacted");
        ihVar.mo55373c("custom_ringtone");
        ihVar.mo55373c("send_to_voicemail");
        ihVar.mo55373c("photo_thumb_uri");
        ihVar.mo55373c("phonebook_label");
        ihVar.mo55373c("data1");
        ihVar.mo55373c("data2");
        ihVar.mo55373c("data3");
        ihVar.mo55373c("data1");
        ihVar.mo55373c("data1");
        ihVar.mo55373c("data4");
        ihVar.mo55373c("data1");
        ihVar.mo55373c("data1");
        ihVar.mo55373c("data2");
        ihVar.mo55373c("data1");
        f111369d = (String[]) ihVar.mo55486f().toArray(new String[0]);
    }
}

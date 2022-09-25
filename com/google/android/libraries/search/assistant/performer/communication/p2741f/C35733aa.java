package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55094fq;
import com.google.p4152bb.p4153a.C55097ft;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.aa */
/* compiled from: PG */
public final class C35733aa {

    /* renamed from: a */
    public static final String[] f93649a = {"_id", "display_name", "display_name_alt", "phonetic_name"};

    /* renamed from: b */
    public static final String[] f93650b = {"display_name", "display_name_alt", "phonetic_name"};

    /* renamed from: f */
    private static final C59071e f93651f = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.f.aa");

    /* renamed from: c */
    public final C35735c f93652c;

    /* renamed from: d */
    public final C60887da f93653d;

    /* renamed from: e */
    public final C60887da f93654e;

    public C35733aa(C35735c cVar, C60887da daVar, C60887da daVar2) {
        this.f93652c = cVar;
        this.f93653d = daVar;
        this.f93654e = daVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C58485gu m64111a(Cursor cursor, String str) {
        if (cursor == null) {
            return C58485gu.m89845m();
        }
        C58480gp e = C58485gu.m89837e();
        try {
            int columnIndex = cursor.getColumnIndex(str);
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                if (string != null) {
                    e.mo55395g(string);
                }
            }
            cursor.close();
            return e.mo55394f();
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    /* renamed from: f */
    public static C55097ft m64112f(Context context, C35758z zVar) {
        C55094fq fqVar = (C55094fq) C55097ft.f144980d.createBuilder();
        if (!zVar.mo39819b().isEmpty() && ((Integer) zVar.mo39819b().get()).intValue() != 0) {
            int intValue = ((Integer) zVar.mo39819b().get()).intValue();
            if (intValue == 1) {
                fqVar.copyOnWrite();
                C55097ft ftVar = (C55097ft) fqVar.instance;
                ftVar.f144983b = 1;
                ftVar.f144982a |= 1;
                return (C55097ft) fqVar.build();
            } else if (intValue == 2) {
                fqVar.copyOnWrite();
                C55097ft ftVar2 = (C55097ft) fqVar.instance;
                ftVar2.f144983b = 3;
                ftVar2.f144982a |= 1;
                return (C55097ft) fqVar.build();
            } else if (intValue == 3) {
                fqVar.copyOnWrite();
                C55097ft ftVar3 = (C55097ft) fqVar.instance;
                ftVar3.f144983b = 2;
                ftVar3.f144982a |= 1;
                return (C55097ft) fqVar.build();
            } else if (intValue != 12) {
                fqVar.copyOnWrite();
                C55097ft ftVar4 = (C55097ft) fqVar.instance;
                ftVar4.f144983b = 5;
                ftVar4.f144982a |= 1;
                return (C55097ft) fqVar.build();
            } else {
                fqVar.copyOnWrite();
                C55097ft ftVar5 = (C55097ft) fqVar.instance;
                ftVar5.f144983b = 4;
                ftVar5.f144982a |= 1;
                return (C55097ft) fqVar.build();
            }
        } else if (zVar.mo39818a().isEmpty() || ((String) zVar.mo39818a().get()).isEmpty()) {
            fqVar.copyOnWrite();
            C55097ft ftVar6 = (C55097ft) fqVar.instance;
            ftVar6.f144983b = 5;
            ftVar6.f144982a |= 1;
            return (C55097ft) fqVar.build();
        } else {
            String str = (String) zVar.mo39818a().orElse(ContactsContract.CommonDataKinds.Phone.getTypeLabel(context.getResources(), 7, BuildConfig.FLAVOR).toString());
            fqVar.copyOnWrite();
            C55097ft ftVar7 = (C55097ft) fqVar.instance;
            str.getClass();
            ftVar7.f144982a |= 2;
            ftVar7.f144984c = str;
            return (C55097ft) fqVar.build();
        }
    }

    /* renamed from: g */
    public static Optional m64113g(Cursor cursor, String... strArr) {
        if (cursor == null) {
            return Optional.empty();
        }
        try {
            if (cursor.moveToFirst()) {
                for (String i : strArr) {
                    Optional i2 = m64115i(cursor, i);
                    if (i2.isPresent()) {
                        return i2;
                    }
                }
            }
            cursor.close();
            return Optional.empty();
        } finally {
            cursor.close();
        }
    }

    /* renamed from: h */
    public static Optional m64114h(Cursor cursor, String str) {
        return m64113g(cursor, str);
    }

    /* renamed from: i */
    public static Optional m64115i(Cursor cursor, String str) {
        try {
            String string = cursor.getString(cursor.getColumnIndex(str));
            if (!TextUtils.isEmpty(string)) {
                return Optional.m71637of(string);
            }
        } catch (IndexOutOfBoundsException unused) {
            ((C59052c) ((C59052c) f93651f.mo56224b()).mo56372aa(51781)).mo56389s("Couldn't find column %s", str);
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public final C60870cx mo39814b(long j) {
        String[] strArr = {"photo_thumb_uri"};
        String str = "_id = ?";
        C46463o a = this.f93652c.mo39825a(ContactsContract.Contacts.CONTENT_URI, strArr, str, new String[]{Long.toString(j)}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return a.f121591a.mo57272e(C47810es.m84970j(C35742j.f93669a), this.f93653d).mo57275g();
    }

    /* renamed from: c */
    public final C60870cx mo39815c(long j) {
        String[] strArr = {"display_name"};
        String str = "_id = ?";
        C46463o a = this.f93652c.mo39825a(ContactsContract.Contacts.CONTENT_URI, strArr, str, new String[]{Long.toString(j)}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return a.f121591a.mo57272e(C47810es.m84970j(C35750r.f93677a), this.f93653d).mo57275g();
    }

    /* renamed from: d */
    public final C60870cx mo39816d(long j) {
        String[] strArr = {"starred"};
        String str = "_id = ?";
        C46463o a = this.f93652c.mo39825a(ContactsContract.Contacts.CONTENT_URI, strArr, str, new String[]{Long.toString(j)}, "starred DESC", C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return a.f121591a.mo57272e(C47810es.m84970j(C35744l.f93671a), this.f93653d).mo57275g();
    }

    /* renamed from: e */
    public final C60870cx mo39817e(long j, Optional optional) {
        Object obj;
        Optional map = optional.map(new C35751s(this, j));
        String[] strArr = {"_id"};
        String str = "contact_id = ? AND deleted = ?";
        C46463o a = this.f93652c.mo39825a(ContactsContract.RawContacts.CONTENT_URI, strArr, str, new String[]{Long.toString(j), "0"}, (String) null, C39226b.TAG_CLASSIC_SERVICES_CO);
        if (a == null) {
            obj = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            obj = a.f121591a.mo57272e(C47810es.m84970j(C35748p.f93675a), this.f93653d).mo57275g();
        }
        C35752t tVar = new C35752t(this);
        return C60922j.m93045h((C60870cx) map.orElse(obj), C47810es.m84966f(tVar), this.f93654e);
    }
}

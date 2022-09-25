package com.google.android.libraries.search.assistant.p2497ab;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.ab.bd */
/* compiled from: PG */
public final class C32389bd implements C32377as {

    /* renamed from: a */
    public static final C59071e f86813a = C59071e.m91332i("com.google.android.libraries.search.assistant.ab.bd");

    /* renamed from: b */
    static final String[] f86814b = {"contact_id", "account_type", "account_name"};

    /* renamed from: c */
    static final String[] f86815c = {"contact_id", "display_name", "data4", "data1", "starred", "data1", "mimetype"};

    /* renamed from: d */
    public final C32409d f86816d;

    /* renamed from: e */
    public final C46877q f86817e;

    /* renamed from: f */
    public final Executor f86818f;

    /* renamed from: g */
    private final C60950i f86819g;

    /* renamed from: h */
    private final Executor f86820h;

    /* renamed from: i */
    private final Context f86821i;

    public C32389bd(C60950i iVar, Context context, Executor executor, Executor executor2, C46877q qVar, C21370a aVar) {
        this.f86819g = iVar;
        this.f86821i = context;
        this.f86817e = qVar;
        this.f86818f = executor;
        this.f86820h = executor2;
        this.f86816d = new C32359aa(aVar, qVar, executor);
    }

    /* renamed from: c */
    public static String m60178c() {
        if (Locale.getDefault() == null) {
            return Locale.US.getCountry();
        }
        return Locale.getDefault().getCountry();
    }

    /* renamed from: d */
    public static String m60179d(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (cursor.isNull(columnIndex)) {
                return BuildConfig.FLAVOR;
            }
            String string = cursor.getString(columnIndex);
            if (TextUtils.isEmpty(string)) {
                return BuildConfig.FLAVOR;
            }
            return string;
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f86813a.mo56226d()).mo56382g(e)).mo56372aa(52627)).mo56389s("Exception in getString from column: %s", str);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: a */
    public final C60870cx mo38051a(C38469m mVar) {
        return C47633f.m84733g(mo38053b(BuildConfig.FLAVOR)).mo51515h(new C32381aw(this.f86819g.mo57444a()), this.f86820h).mo51516i(new C32382ax(mVar), this.f86820h).mo51515h(C32383ay.f86806a, this.f86820h).mo51513e(GellerException.class, C32384az.f86807a, this.f86820h);
    }

    /* renamed from: b */
    public final C60870cx mo38053b(String str) {
        if (!C36196a.m64596a("android.permission.READ_CONTACTS", this.f86821i)) {
            return C60856cj.m92900i(C32376ar.f86796d);
        }
        C60838bs g = this.f86817e.mo50872b(ContactsContract.RawContacts.CONTENT_URI, f86814b, (String) null, (String[]) null, (String) null).f121591a.mo57272e(C47810es.m84970j(C32379au.f86802a), this.f86818f).mo57275g();
        C32386ba baVar = new C32386ba(this, str);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(baVar), this.f86818f);
        C32387bb bbVar = new C32387bb(this);
        return C60922j.m93045h(h, C47810es.m84966f(bbVar), this.f86818f);
    }
}

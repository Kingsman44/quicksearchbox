package com.google.apps.tiktok.p3644h.p3645a.p3646a;

import android.content.Context;
import com.google.frameworks.client.data.android.C61367ai;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;

/* renamed from: com.google.apps.tiktok.h.a.a.a */
/* compiled from: PG */
public final class C47104a implements C61485f {

    /* renamed from: a */
    static final C70297cz f122704a = new C70290cs("Accept-Language", C70334de.f187481c);

    /* renamed from: b */
    private final Context f122705b;

    /* renamed from: c */
    private final boolean f122706c;

    public C47104a(Context context) {
        this.f122705b = context;
        Boolean bool = false;
        this.f122706c = bool.booleanValue();
    }

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        String str;
        C70334de deVar = bVar.f166235a;
        C70297cz czVar = f122704a;
        if (this.f122706c) {
            str = this.f122705b.getResources().getConfiguration().getLocales().toLanguageTags();
        } else {
            str = C61367ai.m93877c();
        }
        deVar.mo62033h(czVar, str);
        return C61479al.f166225a;
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}

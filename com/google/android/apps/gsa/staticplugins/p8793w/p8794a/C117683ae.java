package com.google.android.apps.gsa.staticplugins.p8793w.p8794a;

import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59336s;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4486ci.p4487a.C58097b;
import com.google.p4486ci.p4487a.C58101f;
import com.google.p4486ci.p4487a.C58114s;
import com.google.p4486ci.p4487a.C58115t;
import com.google.p4486ci.p4487a.C58116u;
import com.google.p4486ci.p4487a.C58118w;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.a.ae */
/* compiled from: PG */
final class C117683ae extends C58118w implements C117684af {

    /* renamed from: a */
    public final C58097b f326638a;

    /* renamed from: b */
    public final File f326639b;

    /* renamed from: c */
    public final C60870cx f326640c;

    /* renamed from: d */
    public String f326641d;

    /* renamed from: e */
    final /* synthetic */ C117687ai f326642e;

    public C117683ae(C117687ai aiVar, C58097b bVar, File file, C60870cx cxVar) {
        this.f326642e = aiVar;
        this.f326638a = bVar;
        this.f326639b = file;
        this.f326640c = cxVar;
    }

    /* renamed from: a */
    public final void mo23080a(C58114s sVar, C58116u uVar) {
        ((C59052c) ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56382g(uVar)).mo56372aa(18581)).mo56354G("Audio upload failed due to error type: %s ; Details: %s", uVar.f155364a, uVar.getMessage());
        this.f326642e.f326654k.set(false);
        if (uVar == null || !uVar.f155364a.equals(C58115t.CONNECTION_ERROR) || this.f326642e.f326653j.get() || sVar.mo54660c() == null) {
            this.f326642e.mo103432c(this.f326638a, this.f326639b, this.f326640c);
            return;
        }
        String c = sVar.mo54660c();
        c.getClass();
        this.f326641d = c;
        C117687ai aiVar = this.f326642e;
        aiVar.f326652i.f326643a = this;
        ((C89037bh) aiVar.f326651h.mo27525b()).mo27382h(this.f326642e.f326652i);
    }

    /* renamed from: b */
    public final void mo23081b(C58101f fVar) {
        this.f326642e.mo103432c(this.f326638a, this.f326639b, this.f326640c);
        try {
            C59336s.m92218a(new InputStreamReader(fVar.f155304c, StandardCharsets.UTF_8));
            if (fVar.f155302a == 200) {
                fVar.mo54656a();
            } else {
                fVar.mo54656a();
            }
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C117687ai.f326644a.mo56225c()).mo56382g(e)).mo56372aa(18587)).mo56386p("Error when parsing response body.");
        }
    }
}

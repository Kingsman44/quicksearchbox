package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.i */
/* compiled from: PG */
public final /* synthetic */ class C116053i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116070z f321801a;

    /* renamed from: b */
    public final /* synthetic */ long f321802b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f321803c;

    public /* synthetic */ C116053i(C116070z zVar, long j, byte[] bArr) {
        this.f321801a = zVar;
        this.f321802b = j;
        this.f321803c = bArr;
    }

    public final void run() {
        C116070z zVar = this.f321801a;
        long j = this.f321802b;
        byte[] bArr = this.f321803c;
        File q = zVar.mo102447q(j);
        if (q != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(q);
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
                C58976aa aaVar = C58975e.f156826a;
            } catch (IOException e) {
                C59104x c = C116070z.f321840a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "RecentlyStorage");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30941)).mo56386p("Failed to save data");
            }
        }
    }
}

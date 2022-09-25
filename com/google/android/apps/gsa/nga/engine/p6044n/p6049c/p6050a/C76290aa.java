package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80312bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80315bj;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.util.C23335a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C76290aa implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C76291ab f211320a;

    /* renamed from: b */
    public final /* synthetic */ C80315bj f211321b;

    /* renamed from: c */
    public final /* synthetic */ C65475b f211322c;

    public /* synthetic */ C76290aa(C76291ab abVar, C80315bj bjVar, C65475b bVar) {
        this.f211320a = abVar;
        this.f211321b = bjVar;
        this.f211322c = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80312bg bgVar;
        C76291ab abVar = this.f211320a;
        C80315bj bjVar = this.f211321b;
        C65475b bVar = this.f211322c;
        if (bjVar.f220398a == 2) {
            bgVar = (C80312bg) bjVar.f220399b;
        } else {
            bgVar = C80312bg.f220391b;
        }
        Uri parse = Uri.parse(bgVar.f220393a);
        try {
            C23335a.m43766c(abVar.f211324b.getContentResolver(), parse);
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C76291ab.f211323a.mo56226d()).mo56382g(e)).mo56372aa(3523)).mo56389s("Failed to delete uri=%s", parse);
            C83334w wVar = abVar.f211327e;
            C82887ec ecVar = C82887ec.EXECUTION_FAILED;
            C82885ea eaVar = C82885ea.f225977c;
            C83320io ioVar = bVar.f177980a;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            wVar.mo75545c(ecVar, eaVar, ioVar);
            Locale forLanguageTag = Locale.forLanguageTag(bVar.f177982c);
            abVar.f211326d.mo72162b(abVar.f211328f.mo75121a(forLanguageTag).getString(R.string.nga_screenshot_deleting_failed, new Object[0]), C76298ai.f211336a);
        }
        return C118826c.f331423b;
    }
}

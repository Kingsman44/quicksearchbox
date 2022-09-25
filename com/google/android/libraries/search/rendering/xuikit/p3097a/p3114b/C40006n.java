package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.material.snackbar.Snackbar;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b.C64250g;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b.C64251h;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.n */
/* compiled from: PG */
final class C40006n {

    /* renamed from: a */
    public boolean f105153a = false;

    /* renamed from: b */
    final /* synthetic */ C40007o f105154b;

    public C40006n(C40007o oVar) {
        this.f105154b = oVar;
    }

    /* renamed from: a */
    public final Snackbar mo42116a(C64251h hVar, C21311r rVar) {
        int i;
        C40007o oVar = this.f105154b;
        Context context = oVar.f105155a;
        View findViewById = oVar.f105156b.findViewById(16908290);
        String str = hVar.f173725b;
        int i2 = hVar.f173727d;
        int a = C64250g.m96368a(i2);
        if (a != 0 && a == 2) {
            i = 0;
        } else {
            int a2 = C64250g.m96368a(i2);
            i = (a2 != 0 && a2 == 3) ? -1 : -2;
        }
        Snackbar q = Snackbar.m79661q(context, findViewById, str, i);
        if ((hVar.f173724a & 8) != 0) {
            CommandOuterClass$Command commandOuterClass$Command = hVar.f173728e;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            q.mo48352s(hVar.f173726c, new C40004l(this, commandOuterClass$Command, rVar));
        }
        if ((hVar.f173724a & 16) != 0) {
            q.mo48348m(new C40005m(this, hVar, rVar));
        }
        return q;
    }
}

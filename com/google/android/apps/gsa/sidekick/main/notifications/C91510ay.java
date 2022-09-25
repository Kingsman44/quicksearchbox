package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.Notification;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.apps.gsa.staticplugins.chime.C97666ai;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p375ai.p378b.C7668fn;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56971g;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56972h;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.ay */
/* compiled from: PG */
final class C91510ay extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C91530d f255242a;

    /* renamed from: b */
    final /* synthetic */ int f255243b;

    /* renamed from: c */
    final /* synthetic */ Notification f255244c;

    /* renamed from: d */
    final /* synthetic */ C91520be f255245d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91510ay(C91520be beVar, C91530d dVar, int i, Notification notification) {
        super("NowNotificationManager", "Notify", 8);
        this.f255245d = beVar;
        this.f255242a = dVar;
        this.f255243b = i;
        this.f255244c = notification;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C7669fo j;
        if (this.f255245d.f255267j.mo56113h() && (j = this.f255242a.mo85884j()) != null) {
            C97666ai aiVar = (C97666ai) this.f255245d.f255267j.mo56107c();
            String F = aiVar.f272757b.mo79659F();
            if (F != null) {
                C56971g gVar = (C56971g) C56972h.f152076c.createBuilder();
                String hexString = Long.toHexString(j.f26638d);
                String str = j.f26636b;
                C7668fn a = C7668fn.m22799a(j.f26637c);
                if (a == null) {
                    a = C7668fn.TYPE_UNDEFINED;
                }
                String str2 = "a:snotification:[0x" + hexString + "," + str + "," + a.name() + "]";
                gVar.copyOnWrite();
                C56972h hVar = (C56972h) gVar.instance;
                hVar.f152078a = 1;
                hVar.f152079b = str2;
                aiVar.f272756a.mo90784a(F, C58485gu.m89846n((C56972h) gVar.build()), C58836b.f156633a);
            }
        }
        return Boolean.valueOf(this.f255245d.f255261d.mo85703f(C48004n.f124238a, this.f255243b, this.f255244c));
    }
}

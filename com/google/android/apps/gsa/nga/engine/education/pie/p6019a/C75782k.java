package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80268w;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80270y;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import java.util.Locale;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.k */
/* compiled from: PG */
public final /* synthetic */ class C75782k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75784m f210319a;

    /* renamed from: b */
    public final /* synthetic */ C80268w f210320b;

    /* renamed from: c */
    public final /* synthetic */ Locale f210321c;

    public /* synthetic */ C75782k(C75784m mVar, C80268w wVar, Locale locale) {
        this.f210319a = mVar;
        this.f210320b = wVar;
        this.f210321c = locale;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        C75784m mVar = this.f210319a;
        C80268w wVar = this.f210320b;
        Locale locale = this.f210321c;
        C75650ai aiVar = (C75650ai) obj;
        C80270y yVar = (C80270y) C80271z.f220273d.createBuilder();
        if (aiVar.mo71798b().mo71780b() == 1) {
            str = aiVar.mo71798b().mo71796c();
        } else {
            str = mVar.f210325b.mo75121a(locale).getString(aiVar.mo71798b().mo71779a(), new Object[0]);
        }
        yVar.copyOnWrite();
        C80271z zVar = (C80271z) yVar.instance;
        str.getClass();
        zVar.f220275a |= 1;
        zVar.f220276b = str;
        if (aiVar.mo71799c().mo71780b() == 1) {
            str2 = aiVar.mo71799c().mo71796c();
        } else {
            str2 = mVar.f210325b.mo75121a(locale).getString(aiVar.mo71799c().mo71779a(), new Object[0]);
        }
        yVar.copyOnWrite();
        C80271z zVar2 = (C80271z) yVar.instance;
        str2.getClass();
        zVar2.f220275a |= 2;
        zVar2.f220277c = str2;
        C80271z zVar3 = (C80271z) yVar.build();
        wVar.copyOnWrite();
        C80269x xVar = (C80269x) wVar.instance;
        C80269x xVar2 = C80269x.f220270b;
        zVar3.getClass();
        xVar.mo74299a();
        xVar.f220272a.add(zVar3);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}

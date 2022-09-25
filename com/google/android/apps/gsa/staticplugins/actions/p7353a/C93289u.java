package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.C87425m;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.C87494p;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.NotificationClientResult;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.Result;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ResultGroup;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.u */
/* compiled from: PG */
public final class C93289u implements C93249a {

    /* renamed from: a */
    public static final C59071e f260168a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.a.u");

    /* renamed from: b */
    public final C91097g f260169b;

    /* renamed from: c */
    public final boolean f260170c;

    /* renamed from: d */
    public final Context f260171d;

    /* renamed from: e */
    public final C68214a f260172e;

    /* renamed from: f */
    private final C87449m f260173f;

    /* renamed from: g */
    private final C87425m f260174g;

    public C93289u(C91097g gVar, boolean z, Context context, C68214a aVar, C87449m mVar, PackageManager packageManager) {
        this.f260169b = gVar;
        this.f260170c = z;
        this.f260171d = context;
        this.f260172e = aVar;
        this.f260173f = mVar;
        this.f260174g = new C87425m(packageManager, context, true);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C87421i mo87580a(VoiceAction voiceAction, int i) {
        C55240la P;
        Object obj;
        C55240la a;
        ModularAnswer modularAnswer = (ModularAnswer) voiceAction;
        ModularAnswerImpl modularAnswerImpl = (ModularAnswerImpl) modularAnswer;
        if (!modularAnswerImpl.f260516g.isEmpty()) {
            for (ResultGroup resultGroup : modularAnswerImpl.f260516g) {
                Iterator it = resultGroup.f260547b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Result result = (Result) it.next();
                        if ((result instanceof NotificationClientResult) && (a = ((NotificationClientResult) result).mo87671a()) != null) {
                            C62940bt r5 = C62942bv.checkIsLite(C55208jw.f145316z);
                            a.mo58887l(r5);
                            if (a.f169962ag.mo58857o(r5.f169971d)) {
                                return (C87421i) result.mo87673c(new C93287s(this, i, a, modularAnswer));
                            }
                        }
                    }
                }
            }
        }
        if (i == 1 && (P = modularAnswerImpl.mo87665P()) != null) {
            C62940bt r9 = C62942bv.checkIsLite(C55208jw.f145316z);
            P.mo58887l(r9);
            if (!P.f169962ag.mo58857o(r9.f169971d)) {
                return C87421i.f236081c;
            }
            C62940bt r92 = C62942bv.checkIsLite(C55208jw.f145316z);
            P.mo58887l(r92);
            Object l = P.f169962ag.mo58854l(r92.f169971d);
            if (l == null) {
                obj = r92.f169969b;
            } else {
                obj = r92.mo58889c(l);
            }
            return mo87620c(modularAnswer, (C55208jw) obj);
        }
        Result result2 = modularAnswerImpl.f260520k;
        if (result2 == null) {
            return C87421i.f236081c;
        }
        modularAnswerImpl.f260520k = null;
        return (C87421i) result2.mo87673c(new C93287s(this, i, result2.mo87671a(), modularAnswer));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MatchingProviderInfo mo87581b(VoiceAction voiceAction, boolean z) {
        C93288t tVar = new C93288t(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ResultGroup resultGroup : ((ModularAnswerImpl) ((ModularAnswer) voiceAction)).f260516g) {
            Iterator it = resultGroup.f260547b.iterator();
            while (true) {
                if (it.hasNext()) {
                    MatchingProviderInfo matchingProviderInfo = (MatchingProviderInfo) ((Result) it.next()).mo87673c(tVar);
                    if (matchingProviderInfo.mo81436f()) {
                        return matchingProviderInfo;
                    }
                    for (C55361pn pnVar : matchingProviderInfo.f236270h.f236312a) {
                        String c = C87494p.m142026c(pnVar);
                        if (c != null && !arrayList2.contains(c)) {
                            arrayList.add(pnVar);
                            arrayList2.add(c);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return C87489k.m142014b();
        }
        return new MatchingProviderInfo(arrayList, (C55361pn) null, false);
    }

    /* renamed from: c */
    public final C87421i mo87620c(ModularAnswer modularAnswer, C55208jw jwVar) {
        jwVar.getClass();
        Intent a = this.f260174g.mo81206a(jwVar, modularAnswer, this.f260173f);
        if (a == null) {
            return C87421i.f236081c;
        }
        if (this.f260169b.mo65089a(a)) {
            return C87421i.f236079a;
        }
        return C87421i.f236081c;
    }
}

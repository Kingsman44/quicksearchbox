package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.apps.gsa.handsfree.i;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.core.ModularAnswer;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.C93416f;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.ClockResult;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.results.SmsResult;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55299nf;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.s */
/* compiled from: PG */
final class C93287s implements C93416f {

    /* renamed from: a */
    final /* synthetic */ C93289u f260163a;

    /* renamed from: b */
    private final int f260164b;

    /* renamed from: c */
    private final C55240la f260165c;

    /* renamed from: d */
    private final ModularAnswer f260166d;

    public C93287s(C93289u uVar, int i, C55240la laVar, ModularAnswer modularAnswer) {
        this.f260163a = uVar;
        this.f260164b = i;
        this.f260165c = laVar;
        this.f260166d = modularAnswer;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo87615a(ClockResult clockResult) {
        Object obj;
        C55240la laVar = this.f260165c;
        if (laVar == null) {
            ((C59052c) ((C59052c) C93289u.f260168a.mo56226d()).mo56372aa(13528)).mo56387q("No executionInfo found for the clock search result Id %d.", clockResult.f260545e);
            return C87421i.f236081c;
        }
        C62940bt r5 = C62942bv.checkIsLite(C55208jw.f145316z);
        laVar.mo58887l(r5);
        if (!laVar.f169962ag.mo58857o(r5.f169971d)) {
            return C87421i.f236081c;
        }
        C93289u uVar = this.f260163a;
        ModularAnswer modularAnswer = this.f260166d;
        C55240la laVar2 = this.f260165c;
        C62940bt r2 = C62942bv.checkIsLite(C55208jw.f145316z);
        laVar2.mo58887l(r2);
        Object l = laVar2.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        return uVar.mo87620c(modularAnswer, (C55208jw) obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo87616b(SmsResult smsResult) {
        if (this.f260164b != 3) {
            return C87421i.f236081c;
        }
        return this.f260163a.f260169b.mo65089a(C93266an.m153355a(smsResult.f260549b)) ? C87421i.f236079a : C87421i.f236081c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo87617c() {
        Object obj;
        C55240la laVar = this.f260165c;
        if (laVar == null) {
            ((C59052c) ((C59052c) C93289u.f260168a.mo56226d()).mo56372aa(13529)).mo56386p("no executionInfo.");
            return C87421i.f236081c;
        }
        C62940bt r1 = C62942bv.checkIsLite(C55208jw.f145316z);
        laVar.mo58887l(r1);
        if (laVar.f169962ag.mo58857o(r1.f169971d)) {
            C93289u uVar = this.f260163a;
            ModularAnswer modularAnswer = this.f260166d;
            C55240la laVar2 = this.f260165c;
            C62940bt r3 = C62942bv.checkIsLite(C55208jw.f145316z);
            laVar2.mo58887l(r3);
            Object l = laVar2.f169962ag.mo58854l(r3.f169971d);
            if (l == null) {
                obj = r3.f169969b;
            } else {
                obj = r3.mo58889c(l);
            }
            return uVar.mo87620c(modularAnswer, (C55208jw) obj);
        }
        C55240la laVar3 = this.f260165c;
        C62940bt r12 = C62942bv.checkIsLite(C55299nf.f145680b);
        laVar3.mo58887l(r12);
        return laVar3.f169962ag.mo58857o(r12.f169971d) ? C87421i.f236079a : C87421i.f236081c;
    }

    /* renamed from: d */
    public final C87421i mo87619e() {
        Object obj;
        if (this.f260164b != 1) {
            return C87421i.f236081c;
        }
        C55240la laVar = this.f260165c;
        if (laVar != null) {
            C62940bt r1 = C62942bv.checkIsLite(C55208jw.f145316z);
            laVar.mo58887l(r1);
            if (laVar.f169962ag.mo58857o(r1.f169971d)) {
                C55240la laVar2 = this.f260165c;
                C62940bt r12 = C62942bv.checkIsLite(C55208jw.f145316z);
                laVar2.mo58887l(r12);
                Object l = laVar2.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj = r12.f169969b;
                } else {
                    obj = r12.mo58889c(l);
                }
                String str = ((C55208jw) obj).f145337t;
                if (!TextUtils.isEmpty(str)) {
                    PendingIntent a = ((i) this.f260163a.f260172e.mo27525b()).a(str);
                    if (a != null) {
                        try {
                            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                            tzVar.copyOnWrite();
                            C60555uf ufVar = (C60555uf) tzVar.instance;
                            ufVar.f164093a |= 2;
                            ufVar.f164258m = 585;
                            int i = this.f260166d.mo81066g().f146230cP;
                            tzVar.copyOnWrite();
                            C60555uf ufVar2 = (C60555uf) tzVar.instance;
                            ufVar2.f164093a |= 256;
                            ufVar2.f164264s = i;
                            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                            a.send();
                            C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                            tzVar2.copyOnWrite();
                            C60555uf ufVar3 = (C60555uf) tzVar2.instance;
                            ufVar3.f164093a |= 2;
                            ufVar3.f164258m = 794;
                            int i2 = this.f260166d.mo81066g().f146230cP;
                            tzVar2.copyOnWrite();
                            C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                            ufVar4.f164093a |= 256;
                            ufVar4.f164264s = i2;
                            C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                            return C87421i.f236079a;
                        } catch (PendingIntent.CanceledException e) {
                            C60548tz tzVar3 = (C60548tz) C60555uf.f164065cO.createBuilder();
                            tzVar3.copyOnWrite();
                            C60555uf ufVar5 = (C60555uf) tzVar3.instance;
                            ufVar5.f164093a |= 2;
                            ufVar5.f164258m = 793;
                            int i3 = this.f260166d.mo81066g().f146230cP;
                            tzVar3.copyOnWrite();
                            C60555uf ufVar6 = (C60555uf) tzVar3.instance;
                            ufVar6.f164093a |= 256;
                            ufVar6.f164264s = i3;
                            C89949q.m146525j((C60555uf) tzVar3.build(), (C60321oe) null, (C63196b) null, (String) null);
                            ((C59052c) ((C59052c) ((C59052c) C93289u.f260168a.mo56225c()).mo56382g(e)).mo56372aa(13534)).mo56386p("pending intent canceled");
                        }
                    } else {
                        ((C59052c) ((C59052c) C93289u.f260168a.mo56226d()).mo56372aa(13535)).mo56386p("pending intent null");
                        return C87421i.f236081c;
                    }
                }
                return C87421i.f236081c;
            }
        }
        ((C59052c) ((C59052c) C93289u.f260168a.mo56226d()).mo56372aa(13531)).mo56386p("no executionInfo.");
        return C87421i.f236081c;
    }
}

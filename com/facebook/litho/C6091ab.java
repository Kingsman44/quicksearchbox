package com.facebook.litho;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.p325d.C6180a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.ab */
/* compiled from: PG */
public abstract class C6091ab implements C6145bz {

    /* renamed from: a */
    private static final Map f17986a = new HashMap();

    /* renamed from: b */
    private static final AtomicInteger f17987b = new AtomicInteger();

    /* renamed from: c */
    private static final C6230ed f17988c = new C6230ed();

    /* renamed from: z */
    public static final /* synthetic */ int f17989z = 0;

    /* renamed from: y */
    public final int f17990y;

    static {
        boolean z = C6180a.f18234a;
    }

    public C6091ab() {
        int intValue;
        Class<?> cls = getClass();
        Map map = f17986a;
        synchronized (map) {
            if (!map.containsKey(cls)) {
                map.put(cls, Integer.valueOf(f17987b.incrementAndGet()));
            }
            intValue = ((Integer) map.get(cls)).intValue();
        }
        this.f17990y = intValue;
    }

    /* renamed from: L */
    public static C6154cb m15817L(Class cls, String str, C6411u uVar, int i, Object[] objArr) {
        C6407q qVar;
        C6154cb cbVar;
        if (uVar == null || (qVar = uVar.f19012e) == null) {
            C6106aq.m15891b(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            return C6242ep.f18460a;
        }
        if (cls != qVar.getClass()) {
            C6106aq.m15891b(2, "ComponentLifecycle:WrongContextForEventHandler:".concat(qVar.mo13461q()), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", new Object[]{str, uVar.f19012e.mo13461q()}));
        }
        C6407q qVar2 = uVar.f19012e;
        if (qVar2 == null) {
            C6106aq.m15891b(3, "ComponentContext:NoScopeEventHandler", "Creating event handler without scope.");
            cbVar = C6242ep.f18460a;
        } else {
            cbVar = new C6154cb(qVar2, i, objArr);
        }
        ComponentTree componentTree = uVar.f19017j;
        if (componentTree != null) {
            componentTree.f17877H.mo13140d(C6407q.m17273E(uVar.f19012e), cbVar);
        }
        return cbVar;
    }

    /* renamed from: S */
    protected static void m15818S(C6411u uVar, Exception exc) {
        C6103an.m15876c(uVar, exc);
    }

    /* renamed from: aD */
    static C6230ed m15819aD() {
        boolean z = C6180a.f18234a;
        return f17988c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public int mo12793K() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C6236ej mo12794M() {
        getClass().getSimpleName();
        return new C6125bf(mo12793K());
    }

    /* renamed from: N */
    public final Object mo12795N(C6154cb cbVar, Object obj) {
        if (cbVar.f18198c == -1048037474) {
            return mo12796O(cbVar, obj);
        }
        try {
            return mo12796O(cbVar, obj);
        } catch (Exception e) {
            Object[] objArr = cbVar.f18199d;
            if (objArr != null) {
                Object obj2 = objArr[0];
                if (obj2 instanceof C6411u) {
                    throw C6103an.m15874a((C6411u) obj2, e);
                }
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public Object mo12796O(C6154cb cbVar, Object obj) {
        if (cbVar.f18198c != -1048037474) {
            return null;
        }
        mo12837m().mo13111fD((C6143bx) obj);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public Object mo12797P(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    /* renamed from: Q */
    public void mo12798Q(C6411u uVar, Object obj) {
        uVar.f19011d = "bind";
        try {
            mo12802V(uVar, obj);
        } catch (Exception e) {
            C6103an.m15877d(uVar, e);
        } finally {
            uVar.f19011d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo12799R(C6411u uVar) {
    }

    /* renamed from: T */
    public void mo12800T(C6411u uVar, Object obj) {
        uVar.f19011d = "mount";
        try {
            mo12805Y(uVar, obj);
        } catch (Exception e) {
            C6103an.m15877d(uVar, e);
        } finally {
            uVar.f19011d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo12801U(C6411u uVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo12802V(C6411u uVar, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo12803W(C6411u uVar, C6564z zVar) {
    }

    /* renamed from: X */
    public void mo12804X(C6411u uVar, C6564z zVar, int i, int i2, C6276fs fsVar) {
        throw new IllegalStateException("You must override onMeasure() if you return true in canMeasure(), ComponentLifecycle is: ".concat(toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo12805Y(C6411u uVar, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo12806Z(C6411u uVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public void mo12807aA(C1991k kVar, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public void mo12808aB(Object obj) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aC */
    public final boolean mo12809aC(C6407q qVar, C6407q qVar2) {
        if (mo12822am()) {
            return mo12828as(qVar, qVar2);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public void mo12810aa(C6411u uVar, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public void mo12811ab(C6381hf hfVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ad */
    public final void mo12813ad(C6411u uVar, Object obj) {
        try {
            mo12808aB(obj);
        } catch (Exception e) {
            C6103an.m15877d(uVar, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae */
    public final void mo12814ae(C6411u uVar, Object obj) {
        try {
            mo12810aa(uVar, obj);
        } catch (Exception e) {
            C6103an.m15877d(uVar, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public boolean mo12815af() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ag */
    public boolean mo12816ag() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public boolean mo12817ah() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public boolean mo12818ai() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aj */
    public boolean mo12819aj() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ak */
    public boolean mo12820ak() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: al */
    public boolean mo12821al() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: am */
    public boolean mo12822am() {
        return false;
    }

    /* renamed from: an */
    public boolean mo12823an() {
        return false;
    }

    /* renamed from: ao */
    public int mo12824ao() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public void mo12825ap(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public C6381hf mo12826aq(C6381hf hfVar) {
        return hfVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public C6407q mo12827ar(C6411u uVar, int i) {
        return C6395i.m17143b(uVar).f18849a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public void mo12829at(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public int mo12830au(int i, int i2) {
        return LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public int mo12831av() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ax */
    public void mo12832ax() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public void mo12833ay() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public void mo12834az(View view, C1991k kVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6407q mo12835c(C6411u uVar) {
        return C6395i.m17143b(uVar).f18849a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6181da mo12836d(C6411u uVar) {
        return C6184dd.m16302a(uVar, (C6407q) this, false, false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C6154cb mo12837m();

    /* renamed from: aw */
    public static C6157ce m15820aw(C6411u uVar, String str, int i) {
        String str2;
        if (uVar.f19012e == null) {
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = uVar.mo13348e();
        }
        return new C6157ce(str2, i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public boolean mo12828as(C6407q qVar, C6407q qVar2) {
        return !qVar.mo13057a(qVar2) || !C6103an.m15880g(qVar == null ? null : qVar.f18999v, qVar2.f18999v);
    }
}

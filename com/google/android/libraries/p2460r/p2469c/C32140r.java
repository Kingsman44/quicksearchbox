package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.p2460r.p2464b.C32050a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32063f;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57353ae;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57357ai;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57361am;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57362an;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57394bs;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57446dq;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57511s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.r */
/* compiled from: PG */
abstract class C32140r extends C32138p {

    /* renamed from: a */
    final List f86320a = new ArrayList();

    /* renamed from: n */
    int[] f86321n = new int[0];

    /* renamed from: o */
    private final C32139q f86322o;

    public C32140r(Context context, C32127e eVar, ViewGroup viewGroup) {
        super(context, eVar, viewGroup);
        this.f86322o = eVar.f86275d;
    }

    /* renamed from: a */
    public void mo37854a() {
        int[] iArr;
        if (this.f86301e != null && !this.f86320a.isEmpty()) {
            Object obj = this.f86301e;
            obj.getClass();
            List p = mo37851p(obj);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < p.size()) {
                C57362an anVar = (C57362an) p.get(i);
                int b = C57361am.m88331b(anVar.f153243a);
                int i4 = b - 1;
                if (b != 0) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    throw new C32083an(C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("Unhandled Content type: %s", new Object[]{C57361am.m88330a(C57361am.m88331b(anVar.f153243a))}));
                                }
                            }
                        }
                        int i5 = 0;
                        while (true) {
                            iArr = this.f86321n;
                            if (i5 >= iArr[i]) {
                                break;
                            }
                            this.f86322o.mo37950b((C32138p) this.f86320a.get(i3));
                            this.f86320a.remove(i3);
                            ((ViewGroup) this.f86300d).removeViewAt(i2);
                            i5++;
                        }
                        iArr[i] = 0;
                        i++;
                    }
                    for (int i6 = 0; i6 < this.f86321n[i]; i6++) {
                        ((C32138p) this.f86320a.get(i3)).mo37946l();
                        i3++;
                        i2++;
                    }
                    i++;
                } else {
                    throw null;
                }
            }
        }
    }

    /* renamed from: i */
    public void mo37943i() {
        ((ViewGroup) this.f86300d).removeAllViews();
        for (C32138p b : this.f86320a) {
            this.f86322o.mo37950b(b);
        }
        this.f86320a.clear();
    }

    /* renamed from: k */
    public final void mo37945k(View view, C32148z zVar) {
        super.mo37945k(view, zVar);
        for (C32138p k : this.f86320a) {
            k.mo37945k(view, zVar);
        }
    }

    /* renamed from: m */
    public void mo37855m(Object obj, C32148z zVar) {
        mo37953s(mo37851p(obj), zVar);
    }

    /* renamed from: p */
    public abstract List mo37851p(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo37951q(C32138p pVar) {
        this.f86320a.add(pVar);
    }

    /* renamed from: r */
    public final void mo37952r(List list, C32148z zVar) {
        C57369au auVar;
        C57511s sVar;
        C57394bs bsVar;
        C57353ae aeVar;
        C32148z zVar2 = zVar;
        int i = 1;
        int i2 = 2;
        C32050a.m59726a(this.f86321n.length == list.size(), "Internal error in adapters per content (%s != %s). Adapter has not been created?", Integer.valueOf(this.f86321n.length), Integer.valueOf(list.size()));
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < list.size()) {
            C57362an anVar = (C57362an) list.get(i3);
            int i6 = anVar.f153243a;
            int b = C57361am.m88331b(i6);
            int i7 = b - 1;
            if (b != 0) {
                if (i7 == 0) {
                    C32138p pVar = (C32138p) this.f86320a.get(i4);
                    if (anVar.f153243a == 1) {
                        auVar = (C57369au) anVar.f153244b;
                    } else {
                        auVar = C57369au.f153254l;
                    }
                    pVar.mo37941g(pVar.mo37852v(auVar), auVar, zVar2);
                    i4++;
                    i5++;
                } else if (i7 == i) {
                    if (i6 == i2) {
                        sVar = (C57511s) anVar.f153244b;
                    } else {
                        sVar = C57511s.f153621c;
                    }
                    C57359ak d = zVar2.mo37962d(sVar.f153623a);
                    if ((d.f153235a & 16384) != 0) {
                        d = C32063f.m59746a(d);
                    }
                    int i8 = d.f153236b;
                    if (i8 != 15 && !sVar.f153624b) {
                        throw new C32083an(C57404cb.ERR_MISSING_BINDING_VALUE, zVar2.mo37967i(1, C57404cb.ERR_MISSING_BINDING_VALUE, String.format("Element binding not found for %s", new Object[]{sVar.f153623a})));
                    } else if (i8 == 15) {
                        C57369au auVar2 = (C57369au) d.f153237c;
                        C32138p a = this.f86322o.mo37949a(auVar2, zVar2);
                        a.mo37941g(a.mo37852v(auVar2), auVar2, zVar2);
                        this.f86320a.add(i4, a);
                        ((ViewGroup) this.f86300d).addView(a.mo37939e(), i5);
                        this.f86321n[i3] = 1;
                        i5++;
                        i4++;
                    }
                } else if (i7 == i2) {
                    if (i6 == 3) {
                        bsVar = (C57394bs) anVar.f153244b;
                    } else {
                        bsVar = C57394bs.f153311c;
                    }
                    C57446dq h = zVar2.mo37966h(bsVar.f153313a);
                    int i9 = 0;
                    while (i9 < this.f86321n[i3]) {
                        C32138p pVar2 = (C32138p) this.f86320a.get(i4);
                        C32095az azVar = new C32095az(h, (C57357ai) bsVar.f153314b.get(i9));
                        C32113ba b2 = C32114bb.m59824b(azVar, zVar2);
                        C32091av avVar = pVar2.f86303g;
                        Object[] objArr = new Object[0];
                        if (avVar != null) {
                            C32050a.m59726a(avVar instanceof C32113ba, "bindTemplateAdapter only applicable for template adapters", new Object[0]);
                            C32050a.m59726a(b2.equals(pVar2.f86303g), "Template keys did not match", new Object[0]);
                            C32148z a2 = zVar2.mo37959a(azVar.f86176a, azVar.f86177b);
                            C57369au auVar3 = azVar.f86176a.f153449c;
                            if (auVar3 == null) {
                                auVar3 = C57369au.f153254l;
                            }
                            pVar2.mo37941g(pVar2.mo37852v(auVar3), auVar3, a2);
                            i4++;
                            i5++;
                            i9++;
                            i2 = 2;
                        } else {
                            throw new NullPointerException(String.format("Adapter key was null; not initialized correctly?", objArr));
                        }
                    }
                } else if (i7 == 3) {
                    if (i6 == 4) {
                        aeVar = (C57353ae) anVar.f153244b;
                    } else {
                        aeVar = C57353ae.f153220c;
                    }
                    C57359ak d2 = zVar2.mo37962d(aeVar.f153222a);
                    if ((d2.f153235a & 16384) != 0) {
                        d2 = C32063f.m59746a(d2);
                    }
                    int i10 = d2.f153236b;
                    if (i10 != 8 && !aeVar.f153223b) {
                        C57404cb cbVar = C57404cb.ERR_MISSING_BINDING_VALUE;
                        C57404cb cbVar2 = C57404cb.ERR_MISSING_BINDING_VALUE;
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = aeVar.f153222a;
                        throw new C32083an(cbVar, zVar2.mo37967i(i, cbVar2, String.format("Template binding not found for %s", objArr2)));
                    } else if (i10 == 8) {
                        C57394bs bsVar2 = (C57394bs) d2.f153237c;
                        C57446dq h2 = zVar2.mo37966h(bsVar2.f153313a);
                        this.f86321n[i3] = bsVar2.f153314b.size();
                        int i11 = 0;
                        while (i11 < bsVar2.f153314b.size()) {
                            C32138p a3 = this.f86299c.f86276e.mo37918a(new C32095az(h2, (C57357ai) bsVar2.f153314b.get(i11)), zVar2);
                            this.f86320a.add(i4, a3);
                            ((ViewGroup) this.f86300d).addView(a3.mo37939e(), i5);
                            i11++;
                            i5++;
                            i4++;
                        }
                    }
                } else {
                    C57404cb cbVar3 = C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT;
                    C57404cb cbVar4 = C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT;
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = C57361am.m88330a(C57361am.m88331b(anVar.f153243a));
                    throw new C32083an(cbVar3, zVar2.mo37967i(i, cbVar4, String.format("Unhandled Content type: %s", objArr3)));
                }
                i3++;
                i = 1;
            } else {
                throw null;
            }
        }
    }

    /* renamed from: s */
    public final void mo37953s(List list, C32148z zVar) {
        C57369au auVar;
        C57394bs bsVar;
        this.f86321n = new int[list.size()];
        C32050a.m59726a(this.f86320a.isEmpty(), "Child adapters is not empty (has %s elements); release adapter before creating.", Integer.valueOf(this.f86320a.size()));
        int i = 0;
        while (i < list.size()) {
            C57362an anVar = (C57362an) list.get(i);
            int i2 = anVar.f153243a;
            int b = C57361am.m88331b(i2);
            int i3 = b - 1;
            if (b != 0) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            int[] iArr = this.f86321n;
                            if (i2 == 3) {
                                bsVar = (C57394bs) anVar.f153244b;
                            } else {
                                bsVar = C57394bs.f153311c;
                            }
                            C57446dq h = zVar.mo37966h(bsVar.f153313a);
                            for (int i4 = 0; i4 < bsVar.f153314b.size(); i4++) {
                                C32095az azVar = new C32095az(h, (C57357ai) bsVar.f153314b.get(i4));
                                C32114bb bbVar = this.f86299c.f86276e;
                                C32113ba b2 = C32114bb.m59824b(azVar, zVar);
                                C32138p a = bbVar.f86233a.mo37856a(b2);
                                if (a == null) {
                                    C32148z a2 = zVar.mo37959a(azVar.f86176a, azVar.f86177b);
                                    C32139q qVar = bbVar.f86234b;
                                    C57369au auVar2 = azVar.f86176a.f153449c;
                                    if (auVar2 == null) {
                                        auVar2 = C57369au.f153254l;
                                    }
                                    a = qVar.mo37949a(auVar2, a2);
                                    a.f86303g = b2;
                                }
                                mo37951q(a);
                                ((ViewGroup) this.f86300d).addView(a.mo37939e());
                            }
                            iArr[i] = bsVar.f153314b.size();
                        } else if (i3 != 3) {
                            throw new C32083an(C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, zVar.mo37967i(1, C57404cb.ERR_MISSING_OR_UNHANDLED_CONTENT, String.format("Unhandled Content type: %s", new Object[]{C57361am.m88330a(C57361am.m88331b(anVar.f153243a))})));
                        }
                    }
                    this.f86321n[i] = 0;
                } else {
                    int[] iArr2 = this.f86321n;
                    if (i2 == 1) {
                        auVar = (C57369au) anVar.f153244b;
                    } else {
                        auVar = C57369au.f153254l;
                    }
                    C32138p a3 = this.f86322o.mo37949a(auVar, zVar);
                    mo37951q(a3);
                    ((ViewGroup) this.f86300d).addView(a3.mo37939e());
                    iArr2[i] = 1;
                }
                i++;
            } else {
                throw null;
            }
        }
    }

    public C32140r(Context context, C32127e eVar, ViewGroup viewGroup, C32091av avVar) {
        super(context, eVar, viewGroup);
        this.f86303g = avVar;
        this.f86322o = eVar.f86275d;
    }
}

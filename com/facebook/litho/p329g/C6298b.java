package com.facebook.litho.p329g;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.litho.C6349gb;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.p329g.p331b.C6320v;
import com.facebook.litho.widget.C6447bf;
import com.facebook.litho.widget.C6474cf;
import com.facebook.litho.widget.C6491cw;
import com.facebook.litho.widget.C6494cz;
import com.facebook.litho.widget.C6540er;
import com.facebook.litho.widget.C6548m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.litho.g.b */
/* compiled from: PG */
final class C6298b implements C6345x {

    /* renamed from: a */
    public static final boolean f18576a = C6180a.f18234a;

    /* renamed from: b */
    public final C6345x f18577b;

    /* renamed from: c */
    public final SparseArray f18578c = new SparseArray();

    /* renamed from: d */
    public final String f18579d;

    /* renamed from: e */
    public int f18580e = Integer.MAX_VALUE;

    /* renamed from: f */
    public int f18581f = -1;

    /* renamed from: g */
    public int f18582g = -1;

    /* renamed from: h */
    public final C6333l f18583h;

    public C6298b(C6345x xVar, C6333l lVar, String str) {
        this.f18577b = xVar;
        this.f18583h = lVar;
        this.f18579d = str;
    }

    /* renamed from: d */
    private static List m16883d(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i;
        while (i3 < i + i2) {
            C6491cw cwVar = (C6491cw) sparseArray.get(i3);
            if (cwVar != null) {
                arrayList.add(cwVar);
                i3++;
            } else {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", new Object[]{Integer.valueOf(i3)}));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo13299b(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f18583h.mo13343b(this.f18579d, i + i2, (C6491cw) list.get(i2), Thread.currentThread().getName());
        }
    }

    /* renamed from: c */
    public final void mo13300c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f18583h.mo13346e(this.f18579d, i + i2, (C6491cw) list.get(i2), Thread.currentThread().getName());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13298a() {
        C6548m mVar;
        int i = this.f18580e;
        if (i != Integer.MAX_VALUE) {
            if (i == 1) {
                List d = m16883d(this.f18581f, this.f18582g, this.f18578c);
                if (this.f18582g > 1) {
                    C6345x xVar = this.f18577b;
                    ((C6320v) xVar).f18690a.mo13568w(this.f18581f, d);
                    if (f18576a) {
                        mo13299b(this.f18581f, d);
                    }
                } else {
                    C6345x xVar2 = this.f18577b;
                    int i2 = this.f18581f;
                    ((C6320v) xVar2).f18690a.mo13567v(i2, (C6491cw) this.f18578c.get(i2));
                    if (f18576a) {
                        C6333l lVar = this.f18583h;
                        String str = this.f18579d;
                        int i3 = this.f18581f;
                        lVar.mo13343b(str, i3, (C6491cw) this.f18578c.get(i3), Thread.currentThread().getName());
                    }
                }
            } else if (i == 2) {
                List d2 = m16883d(this.f18581f, this.f18582g, this.f18578c);
                if (this.f18582g > 1) {
                    C6345x xVar3 = this.f18577b;
                    ((C6320v) xVar3).f18690a.mo13559K(this.f18581f, d2);
                    if (f18576a) {
                        mo13300c(this.f18581f, d2);
                    }
                } else {
                    C6345x xVar4 = this.f18577b;
                    int i4 = this.f18581f;
                    ((C6320v) xVar4).f18690a.mo13558J(i4, (C6491cw) this.f18578c.get(i4));
                    if (f18576a) {
                        C6333l lVar2 = this.f18583h;
                        String str2 = this.f18579d;
                        int i5 = this.f18581f;
                        lVar2.mo13346e(str2, i5, (C6491cw) this.f18578c.get(i5), Thread.currentThread().getName());
                    }
                }
            } else if (i == 3) {
                int i6 = this.f18582g;
                if (i6 > 1) {
                    C6345x xVar5 = this.f18577b;
                    ((C6320v) xVar5).f18690a.mo13555G(this.f18581f, i6);
                    if (f18576a) {
                        int i7 = this.f18581f;
                        int i8 = this.f18582g;
                        for (int i9 = 0; i9 < i8; i9++) {
                            this.f18583h.mo13342a(this.f18579d, i7 + i9, Thread.currentThread().getName());
                        }
                    }
                } else {
                    C6345x xVar6 = this.f18577b;
                    int i10 = this.f18581f;
                    C6474cf cfVar = ((C6320v) xVar6).f18690a;
                    C6349gb.m17045a();
                    if (C6494cz.f19262a) {
                        int hashCode = cfVar.hashCode();
                        Log.d("SectionsDebug", "(" + hashCode + ") removeItemAt " + i10);
                    }
                    synchronized (cfVar) {
                        mVar = (C6548m) cfVar.f19203a.remove(i10);
                    }
                    cfVar.f19211d.notifyItemRemoved(i10);
                    C6540er erVar = cfVar.f19182B;
                    erVar.mo13621c(erVar.mo13625g(i10));
                    cfVar.f19213f.post(new C6447bf(mVar));
                    if (f18576a) {
                        this.f18583h.mo13342a(this.f18579d, this.f18581f, Thread.currentThread().getName());
                    }
                }
            }
            this.f18580e = Integer.MAX_VALUE;
            this.f18578c.clear();
        }
    }
}

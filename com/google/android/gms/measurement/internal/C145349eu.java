package com.google.android.gms.measurement.internal;

import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.eu */
/* compiled from: PG */
public final class C145349eu {

    /* renamed from: a */
    final /* synthetic */ C145351ew f392885a;

    public C145349eu(C145351ew ewVar) {
        this.f392885a = ewVar;
    }

    /* renamed from: a */
    public final void mo120937a(int i, String str, List list, boolean z, boolean z2) {
        C145323dv dvVar;
        int i2 = i - 1;
        if (i2 == 0) {
            dvVar = this.f392885a.f393011w.mo120965ar().f392802j;
        } else if (i2 != 1) {
            dvVar = i2 != 3 ? i2 != 4 ? this.f392885a.f393011w.mo120965ar().f392801i : z ? this.f392885a.f393011w.mo120965ar().f392799g : !z2 ? this.f392885a.f393011w.mo120965ar().f392800h : this.f392885a.f393011w.mo120965ar().f392798f : this.f392885a.f393011w.mo120965ar().f392803k;
        } else if (z) {
            dvVar = this.f392885a.f393011w.mo120965ar().f392796d;
        } else if (!z2) {
            dvVar = this.f392885a.f393011w.mo120965ar().f392797e;
        } else {
            dvVar = this.f392885a.f393011w.mo120965ar().f392795c;
        }
        int size = list.size();
        if (size == 1) {
            dvVar.mo120895b(str, list.get(0));
        } else if (size == 2) {
            dvVar.mo120896c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            dvVar.mo120894a(str);
        } else {
            dvVar.mo120897d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}

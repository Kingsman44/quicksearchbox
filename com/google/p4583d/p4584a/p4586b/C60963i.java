package com.google.p4583d.p4584a.p4586b;

import com.google.android.gms.measurement.internal.C145349eu;
import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.List;

/* renamed from: com.google.d.a.b.i */
/* compiled from: PG */
public final class C60963i extends C60980g {

    /* renamed from: a */
    public final C145349eu f165080a;

    public C60963i(C145349eu euVar) {
        super("internal.logger");
        this.f165080a = euVar;
        this.f165108e.put("log", new C60962h(this, false, true));
        this.f165108e.put("silent", new C60960f());
        ((C60980g) this.f165108e.get("silent")).mo57484q("log", new C60962h(this, true, true));
        this.f165108e.put("unmonitored", new C60961g());
        ((C60980g) this.f165108e.get("unmonitored")).mo57484q("log", new C60962h(this, false, false));
    }

    /* renamed from: a */
    public final C60987n mo57451a(C61012g gVar, List list) {
        return C60987n.f165114f;
    }
}

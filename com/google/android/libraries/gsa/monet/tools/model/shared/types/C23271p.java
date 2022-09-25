package com.google.android.libraries.gsa.monet.tools.model.shared.types;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.shared.types.p */
/* compiled from: PG */
public final class C23271p implements C23274s {

    /* renamed from: a */
    private final C63010eb f63741a;

    /* renamed from: b */
    private final C62921ba f63742b;

    /* renamed from: c */
    private final C62942bv f63743c;

    public C23271p(C63010eb ebVar, C62921ba baVar, C62942bv bvVar) {
        this.f63741a = ebVar;
        this.f63742b = baVar;
        this.f63743c = bvVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo28732a() {
        return this.f63743c;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28734c(String str, Object obj, Bundle bundle) {
        bundle.putParcelable(str, C23245b.m43556a((C62942bv) obj));
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo28735d(Object obj, Object obj2) {
        return ((C62942bv) obj).equals((C62942bv) obj2);
    }

    /* renamed from: e */
    public final C62942bv mo28733b(String str, C23120p pVar) {
        ProtoParcelable protoParcelable = (ProtoParcelable) pVar.f63472a.getParcelable(str);
        protoParcelable.getClass();
        C62942bv b = C23245b.m43557b(protoParcelable, this.f63741a, this.f63742b, true);
        if (b != null) {
            return b;
        }
        throw new NullPointerException(String.format("Failed to read key: %s. This is known to occur when restoring a proto with required fields", new Object[]{str}));
    }
}

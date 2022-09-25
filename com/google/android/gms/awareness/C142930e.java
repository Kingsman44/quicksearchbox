package com.google.android.gms.awareness;

import android.content.Context;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143819h;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.gms.contextmanager.fence.internal.C144035c;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.awareness.e */
/* compiled from: PG */
public final class C142930e extends C143847s {
    public C142930e(Context context, C142929d dVar) {
        super(context, C142928c.f387830b, dVar, new C143819h());
        dVar.mo117820b(this.f389932x);
    }

    /* renamed from: a */
    public final C146006ab mo117823a(FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        C143840l lVar = C142928c.f387829a;
        return C143918bg.m233956b(C144035c.m234226a(this.f389929D, fenceUpdateRequestImpl));
    }
}

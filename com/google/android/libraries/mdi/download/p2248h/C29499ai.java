package com.google.android.libraries.mdi.download.p2248h;

import com.google.android.libraries.mdi.download.C28730bh;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ai */
/* compiled from: PG */
public final /* synthetic */ class C29499ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79935a;

    /* renamed from: b */
    public final /* synthetic */ C28730bh f79936b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f79937c;

    public /* synthetic */ C29499ai(C29514ax axVar, C28730bh bhVar, AtomicReference atomicReference) {
        this.f79935a = axVar;
        this.f79936b = bhVar;
        this.f79937c = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C29514ax axVar = this.f79935a;
        C28730bh bhVar = this.f79936b;
        AtomicReference atomicReference = this.f79937c;
        Void voidR = (Void) obj;
        C29598bs bsVar = axVar.f79986f;
        return C28738bp.m53591a(bsVar.f80178a.mo46039a(new C29596bq(bhVar.f78051b, (C29581bb) atomicReference.get()), bsVar.f80179b), C28737bo.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to write bookkeeping.");
    }
}

package com.google.android.libraries.logging.p2185ve.synthetic.remote;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28315b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.remote.d */
/* compiled from: PG */
final class C28474d implements C28315b {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f77275a;

    /* renamed from: b */
    final /* synthetic */ TreeNodeRef f77276b;

    public C28474d(TreeNodeRef treeNodeRef, AtomicReference atomicReference) {
        this.f77276b = treeNodeRef;
        this.f77275a = atomicReference;
    }

    /* renamed from: a */
    public final void mo33799b(C28439i iVar) {
        if (this.f77275a.get() == null) {
            if (this.f77276b.f77271a.equals((C28477g) iVar.f77217c.mo58881i(C28473c.f77274a))) {
                this.f77275a.set(iVar);
            } else {
                iVar.f77220f.mo33828l(this);
            }
        }
    }
}

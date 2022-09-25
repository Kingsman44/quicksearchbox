package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.cards.C91693h;
import com.google.p375ai.p378b.C7718hj;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bx */
/* compiled from: PG */
public abstract class C91346bx extends C91693h {

    /* renamed from: a */
    private final C91330bh f254901a;

    protected C91346bx(C91330bh bhVar) {
        this.f254901a = bhVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo85554a(C7718hj hjVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo85555b(C7718hj hjVar, List list);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo85585d(C7718hj hjVar, List list, Object obj) {
        Void voidR = (Void) obj;
        if (Boolean.TRUE.equals(Boolean.valueOf(this.f254901a.mo85587f(hjVar, list)))) {
            return mo85555b(hjVar, list);
        }
        return null;
    }

    /* renamed from: e */
    public final Object mo85661e(C7718hj hjVar) {
        if (Boolean.TRUE.equals(Boolean.valueOf(this.f254901a.mo85586e(hjVar)))) {
            return mo85554a(hjVar);
        }
        return null;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo85588l(C7718hj hjVar, Object obj) {
        Void voidR = (Void) obj;
        return mo85661e(hjVar);
    }
}

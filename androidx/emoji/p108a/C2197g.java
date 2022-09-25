package androidx.emoji.p108a;

import androidx.core.p097i.C1974i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.emoji.a.g */
/* compiled from: PG */
final class C2197g implements Runnable {

    /* renamed from: a */
    private final List f6219a;

    /* renamed from: b */
    private final int f6220b;

    public C2197g(Collection collection, int i) {
        C1974i.m5319g(collection, "initCallbacks cannot be null");
        this.f6219a = new ArrayList(collection);
        this.f6220b = i;
    }

    public final void run() {
        int size = this.f6219a.size();
        int i = 0;
        if (this.f6220b != 1) {
            while (i < size) {
                C2196f fVar = (C2196f) this.f6219a.get(i);
                i++;
            }
            return;
        }
        while (i < size) {
            ((C2196f) this.f6219a.get(i)).mo5510a();
            i++;
        }
    }
}

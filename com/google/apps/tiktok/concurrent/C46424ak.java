package com.google.apps.tiktok.concurrent;

import com.google.common.base.C58817ah;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.google.apps.tiktok.concurrent.ak */
/* compiled from: PG */
public final class C46424ak {

    /* renamed from: a */
    private final Deque f121490a;

    /* renamed from: b */
    private final C58817ah f121491b;

    /* renamed from: c */
    private final int f121492c;

    public C46424ak(int i, C58817ah ahVar) {
        this.f121492c = i;
        this.f121491b = ahVar;
        this.f121490a = new ArrayDeque(i);
    }

    /* renamed from: a */
    public final void mo50397a() {
        while (true) {
            Object poll = this.f121490a.poll();
            if (poll != null) {
                Void voidR = (Void) this.f121491b.apply(poll);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo50398b() {
        return this.f121490a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo50399c(Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque(this.f121490a.size());
        while (this.f121490a.peek() != null && this.f121490a.peek() != obj) {
            arrayDeque.add(this.f121490a.poll());
        }
        if (this.f121490a.peek() != obj) {
            while (true) {
                Object pollLast = arrayDeque.pollLast();
                if (pollLast == null) {
                    return false;
                }
                this.f121490a.addFirst(pollLast);
            }
        } else {
            this.f121490a.poll();
            while (true) {
                Object poll = arrayDeque.poll();
                if (poll == null) {
                    return true;
                }
                Void voidR = (Void) this.f121491b.apply(poll);
            }
        }
    }

    /* renamed from: d */
    public final void mo50400d(Object obj) {
        ArrayDeque arrayDeque = new ArrayDeque(this.f121490a.size());
        while (true) {
            Object poll = this.f121490a.poll();
            if (poll == null) {
                break;
            } else if (arrayDeque.size() < this.f121492c - 1) {
                arrayDeque.add(poll);
            } else {
                Void voidR = (Void) this.f121491b.apply(poll);
            }
        }
        while (true) {
            Object poll2 = arrayDeque.poll();
            if (poll2 != null) {
                this.f121490a.add(poll2);
            } else {
                this.f121490a.add(obj);
                return;
            }
        }
    }
}

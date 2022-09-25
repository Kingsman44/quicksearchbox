package com.google.assistant.p3838ao.p3839a.p3848h;

import com.google.common.p4522b.C58485gu;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.assistant.ao.a.h.j */
/* compiled from: PG */
public final class C49655j {

    /* renamed from: a */
    private final ReentrantLock f128166a = new ReentrantLock();

    /* renamed from: b */
    private final Deque f128167b = new ArrayDeque();

    /* renamed from: a */
    public final C58485gu mo53317a() {
        this.f128166a.lock();
        try {
            return C58485gu.m89842j(this.f128167b);
        } finally {
            this.f128166a.unlock();
        }
    }

    /* renamed from: b */
    public final void mo53318b(Object obj) {
        this.f128166a.lock();
        try {
            this.f128167b.addFirst(obj);
            if (this.f128167b.size() > 20) {
                this.f128167b.removeLast();
            }
        } finally {
            this.f128166a.unlock();
        }
    }
}

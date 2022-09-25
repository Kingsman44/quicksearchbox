package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.common.util.concurrent.bo */
/* compiled from: PG */
final class C60834bo extends AtomicReference implements Executor, Runnable {

    /* renamed from: a */
    C60836bq f164916a;

    /* renamed from: b */
    Executor f164917b;

    /* renamed from: c */
    Runnable f164918c;

    /* renamed from: d */
    Thread f164919d;

    public C60834bo(Executor executor, C60836bq bqVar) {
        super(C60833bn.NOT_RUN);
        this.f164917b = executor;
        this.f164916a = bqVar;
    }

    public final void execute(Runnable runnable) {
        if (get() == C60833bn.CANCELLED) {
            this.f164917b = null;
            this.f164916a = null;
            return;
        }
        this.f164919d = Thread.currentThread();
        try {
            C60835bp bpVar = ((C60836bq) Objects.requireNonNull(this.f164916a)).f164923a;
            if (bpVar.f164920a == this.f164919d) {
                this.f164916a = null;
                C58838bb.m90883r(bpVar.f164921b == null);
                bpVar.f164921b = runnable;
                bpVar.f164922c = (Executor) Objects.requireNonNull(this.f164917b);
                this.f164917b = null;
            } else {
                this.f164917b = null;
                this.f164918c = runnable;
                ((Executor) Objects.requireNonNull(this.f164917b)).execute(this);
            }
        } finally {
            this.f164919d = null;
        }
    }

    public final void run() {
        Executor executor;
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.f164919d) {
            this.f164918c = null;
            ((Runnable) Objects.requireNonNull(this.f164918c)).run();
            return;
        }
        C60835bp bpVar = new C60835bp();
        bpVar.f164920a = currentThread;
        ((C60836bq) Objects.requireNonNull(this.f164916a)).f164923a = bpVar;
        this.f164916a = null;
        try {
            this.f164918c = null;
            ((Runnable) Objects.requireNonNull(this.f164918c)).run();
            while (true) {
                Runnable runnable = bpVar.f164921b;
                if (runnable != null && (executor = bpVar.f164922c) != null) {
                    bpVar.f164921b = null;
                    bpVar.f164922c = null;
                    executor.execute(runnable);
                }
            }
        } finally {
            bpVar.f164920a = null;
        }
    }
}

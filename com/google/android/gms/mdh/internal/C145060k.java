package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.mdh.internal.k */
/* compiled from: PG */
public final class C145060k {

    /* renamed from: a */
    public final Executor f392126a;

    /* renamed from: b */
    public final C145070u f392127b;

    /* renamed from: c */
    public final Account f392128c;

    /* renamed from: d */
    public final int f392129d;

    /* renamed from: e */
    public final int f392130e;

    /* renamed from: f */
    public final Deque f392131f = new ArrayDeque();

    public C145060k(Executor executor, C145070u uVar, Account account, int i, int i2) {
        new WeakHashMap();
        this.f392126a = executor;
        this.f392127b = uVar;
        this.f392128c = account;
        this.f392129d = i;
        this.f392130e = i2;
    }

    /* renamed from: a */
    public static void m235707a(C146010af afVar, C146006ab abVar) {
        if (abVar.mo122491j()) {
            afVar.f394698a.mo122510x(abVar.mo122488g());
            return;
        }
        Exception f = abVar.mo122487f();
        if (f != null) {
            afVar.f394698a.mo122509w(f);
        }
    }
}

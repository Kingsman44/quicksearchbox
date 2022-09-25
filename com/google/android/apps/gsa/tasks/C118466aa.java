package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.p8852u.C118575h;

/* renamed from: com.google.android.apps.gsa.tasks.aa */
/* compiled from: PG */
enum C118466aa {
    PERIODIC(C118575h.VBT_ROOT_PERIODIC_SCHEDULED, C118575h.VBT_ROOT_PERIODIC_EXECUTED, C118575h.VBT_ROOT_PERIODIC_FAILED, C118575h.VBT_ROOT_PERIODIC_CRASHED, C118575h.VBT_ROOT_PERIODIC_TASK_MISSING),
    EXCLUSIVE(C118575h.VBT_ROOT_ONEOFF_EXCLUSIVE_SCHEDULED, C118575h.VBT_ROOT_ONEOFF_EXCLUSIVE_EXECUTED, C118575h.VBT_ROOT_ONEOFF_EXCLUSIVE_FAILED, C118575h.VBT_ROOT_ONEOFF_EXCLUSIVE_CRASHED, C118575h.VBT_ROOT_ONEOFF_EXCLUSIVE_TASK_MISSING),
    NONEXCLUSIVE(C118575h.VBT_ROOT_ONEOFF_NONEXCLUSIVE_SCHEDULED, C118575h.VBT_ROOT_ONEOFF_NONEXCLUSIVE_EXECUTED, C118575h.VBT_ROOT_ONEOFF_NONEXCLUSIVE_FAILED, C118575h.VBT_ROOT_ONEOFF_NONEXCLUSIVE_CRASHED, C118575h.VBT_ROOT_ONEOFF_NONEXCLUSIVE_TASK_MISSING);
    

    /* renamed from: d */
    public final C118575h f328808d;

    /* renamed from: e */
    public final C118575h f328809e;

    /* renamed from: f */
    public final C118575h f328810f;

    /* renamed from: g */
    public final C118575h f328811g;

    /* renamed from: h */
    public final C118575h f328812h;

    private C118466aa(C118575h hVar, C118575h hVar2, C118575h hVar3, C118575h hVar4, C118575h hVar5) {
        this.f328808d = hVar;
        this.f328809e = hVar2;
        this.f328810f = hVar3;
        this.f328811g = hVar4;
        this.f328812h = hVar5;
    }
}

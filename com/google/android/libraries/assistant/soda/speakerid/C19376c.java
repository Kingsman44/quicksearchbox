package com.google.android.libraries.assistant.soda.speakerid;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.c */
/* compiled from: PG */
public final /* synthetic */ class C19376c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SodaEnrollmentManagerImpl f54216a;

    /* renamed from: b */
    public final /* synthetic */ String f54217b;

    public /* synthetic */ C19376c(SodaEnrollmentManagerImpl sodaEnrollmentManagerImpl, String str) {
        this.f54216a = sodaEnrollmentManagerImpl;
        this.f54217b = str;
    }

    public final void run() {
        SodaEnrollmentManagerImpl sodaEnrollmentManagerImpl = this.f54216a;
        sodaEnrollmentManagerImpl.f54186c.remove(this.f54217b);
    }
}

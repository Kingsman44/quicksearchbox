package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.b */
/* compiled from: PG */
public final class C79000b extends C78978ae {

    /* renamed from: a */
    private final Runnable f217278a;

    /* renamed from: b */
    private final Object f217279b;

    /* renamed from: c */
    private final String f217280c;

    /* renamed from: d */
    private final C60870cx f217281d;

    public C79000b(Runnable runnable, Object obj, String str, C60870cx cxVar) {
        this.f217278a = runnable;
        if (obj != null) {
            this.f217279b = obj;
            if (str != null) {
                this.f217280c = str;
                this.f217281d = cxVar;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null score");
    }

    /* renamed from: a */
    public final C60870cx mo73731a() {
        return this.f217281d;
    }

    /* renamed from: b */
    public final Object mo73732b() {
        return this.f217279b;
    }

    /* renamed from: c */
    public final Runnable mo73733c() {
        return this.f217278a;
    }

    /* renamed from: d */
    public final String mo73734d() {
        return this.f217280c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78978ae) {
            C78978ae aeVar = (C78978ae) obj;
            return this.f217278a.equals(aeVar.mo73733c()) && this.f217279b.equals(aeVar.mo73732b()) && this.f217280c.equals(aeVar.mo73734d()) && this.f217281d.equals(aeVar.mo73731a());
        }
    }

    public final int hashCode() {
        return ((((((this.f217278a.hashCode() ^ 1000003) * 1000003) ^ this.f217279b.hashCode()) * 1000003) ^ this.f217280c.hashCode()) * 1000003) ^ this.f217281d.hashCode();
    }

    public final String toString() {
        String obj = this.f217278a.toString();
        String obj2 = this.f217279b.toString();
        String str = this.f217280c;
        String obj3 = this.f217281d.toString();
        return "PriorityTask{task=" + obj + ", score=" + obj2 + ", name=" + str + ", done=" + obj3 + "}";
    }
}

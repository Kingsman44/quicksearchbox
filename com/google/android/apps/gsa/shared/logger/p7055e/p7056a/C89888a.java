package com.google.android.apps.gsa.shared.logger.p7055e.p7056a;

import com.google.common.p4552o.C59791fs;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.a.a */
/* compiled from: PG */
public final class C89888a extends C89901b {

    /* renamed from: a */
    public final String f246288a;

    /* renamed from: b */
    public final C59791fs f246289b;

    public C89888a(String str, C59791fs fsVar) {
        if (str != null) {
            this.f246288a = str;
            if (fsVar != null) {
                this.f246289b = fsVar;
                return;
            }
            throw new NullPointerException("Null platformTaskType");
        }
        throw new NullPointerException("Null taskName");
    }

    /* renamed from: a */
    public final C59791fs mo83727a() {
        return this.f246289b;
    }

    /* renamed from: b */
    public final String mo83728b() {
        return this.f246288a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89901b) {
            C89901b bVar = (C89901b) obj;
            return this.f246288a.equals(bVar.mo83728b()) && this.f246289b.equals(bVar.mo83727a());
        }
    }

    public final int hashCode() {
        return ((this.f246288a.hashCode() ^ 1000003) * 1000003) ^ this.f246289b.hashCode();
    }

    public final String toString() {
        String str = this.f246288a;
        String num = Integer.toString(this.f246289b.f161560e);
        return "PlatformTaskIdentifier{taskName=" + str + ", platformTaskType=" + num + "}";
    }
}

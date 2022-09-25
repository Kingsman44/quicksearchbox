package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.a */
/* compiled from: PG */
final class C124553a extends C124570ap {

    /* renamed from: a */
    private final String f343627a;

    /* renamed from: b */
    private final C124548d f343628b;

    public C124553a(String str, C124548d dVar) {
        this.f343627a = str;
        if (dVar != null) {
            this.f343628b = dVar;
            return;
        }
        throw new NullPointerException("Null deviceInfo");
    }

    /* renamed from: a */
    public final C124548d mo106534a() {
        return this.f343628b;
    }

    /* renamed from: b */
    public final String mo106535b() {
        return this.f343627a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124570ap) {
            C124570ap apVar = (C124570ap) obj;
            String str = this.f343627a;
            if (str != null ? str.equals(apVar.mo106535b()) : apVar.mo106535b() == null) {
                if (this.f343628b.equals(apVar.mo106534a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f343627a;
        String obj = this.f343628b.toString();
        return "DeviceInfoAndAccountNamePair{accountName=" + str + ", deviceInfo=" + obj + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f343627a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f343628b.hashCode();
    }
}

package androidx.media3.extractor;

import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.media3.extractor.az */
/* compiled from: PG */
public final class C3351az {

    /* renamed from: a */
    public final C3365bc f10123a;

    /* renamed from: b */
    public final C3365bc f10124b;

    public C3351az(C3365bc bcVar, C3365bc bcVar2) {
        this.f10123a = bcVar;
        this.f10124b = bcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3351az azVar = (C3351az) obj;
            return this.f10123a.equals(azVar.f10123a) && this.f10124b.equals(azVar.f10124b);
        }
    }

    public final int hashCode() {
        return (this.f10123a.hashCode() * 31) + this.f10124b.hashCode();
    }

    public final String toString() {
        String obj = this.f10123a.toString();
        String concat = this.f10123a.equals(this.f10124b) ? BuildConfig.FLAVOR : ", ".concat(this.f10124b.toString());
        return "[" + obj + concat + "]";
    }
}

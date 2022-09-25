package androidx.appsearch.p053e;

/* renamed from: androidx.appsearch.e.b */
/* compiled from: PG */
public final class C0881b {

    /* renamed from: a */
    public final StringBuilder f2953a = new StringBuilder();

    /* renamed from: b */
    private boolean f2954b = false;

    /* renamed from: c */
    private int f2955c = 0;

    /* renamed from: a */
    public final void mo3490a(String str) {
        int indexOf = str.indexOf("\n");
        if (indexOf == 0) {
            this.f2953a.append("\n");
            this.f2954b = true;
            if (str.length() > 1) {
                mo3490a(str.substring(1));
            }
        } else if (indexOf > 0) {
            mo3490a(str.substring(0, indexOf));
            this.f2953a.append("\n");
            this.f2954b = true;
            int i = indexOf + 1;
            if (str.length() > i) {
                mo3490a(str.substring(i));
            }
        } else {
            if (this.f2954b) {
                for (int i2 = 0; i2 < this.f2955c; i2++) {
                    this.f2953a.append("  ");
                }
                this.f2954b = false;
            }
            this.f2953a.append(str);
        }
    }

    /* renamed from: b */
    public final void mo3491b() {
        int i = this.f2955c;
        if (i != 0) {
            this.f2955c = i - 1;
            return;
        }
        throw new IllegalStateException("Cannot set indent level below 0.");
    }

    /* renamed from: c */
    public final void mo3492c() {
        this.f2955c++;
    }

    public final String toString() {
        return this.f2953a.toString();
    }
}

package p5462h.p5472e;

import java.io.File;

/* renamed from: h.e.e */
/* compiled from: PG */
final class C69601e extends C69600d {

    /* renamed from: b */
    private boolean f186000b;

    /* renamed from: c */
    private File[] f186001c;

    /* renamed from: d */
    private int f186002d;

    /* renamed from: e */
    private boolean f186003e;

    public C69601e(File file) {
        super(file);
    }

    /* renamed from: a */
    public final File mo61363a() {
        int i;
        if (!this.f186003e && this.f186001c == null) {
            File[] listFiles = this.f186010a.listFiles();
            this.f186001c = listFiles;
            if (listFiles == null) {
                this.f186003e = true;
            }
        }
        File[] fileArr = this.f186001c;
        if (fileArr != null && (i = this.f186002d) < fileArr.length) {
            this.f186002d = i + 1;
            return fileArr[i];
        } else if (this.f186000b) {
            return null;
        } else {
            this.f186000b = true;
            return this.f186010a;
        }
    }
}

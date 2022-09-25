package androidx.slice;

import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C4267f;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;

/* compiled from: PG */
public final class Slice extends CustomVersionedParcelable implements C4267f {

    /* renamed from: a */
    static final String[] f13085a = new String[0];

    /* renamed from: b */
    static final SliceItem[] f13086b = new SliceItem[0];

    /* renamed from: c */
    SliceSpec f13087c;

    /* renamed from: d */
    public SliceItem[] f13088d;

    /* renamed from: e */
    public String[] f13089e;

    /* renamed from: f */
    public String f13090f;

    public Slice() {
        this.f13087c = null;
        this.f13088d = f13086b;
        this.f13089e = f13085a;
        this.f13090f = null;
    }

    public Slice(ArrayList arrayList, String[] strArr, Uri uri, SliceSpec sliceSpec) {
        this.f13087c = null;
        this.f13088d = f13086b;
        this.f13090f = null;
        this.f13089e = strArr;
        this.f13088d = (SliceItem[]) arrayList.toArray(new SliceItem[arrayList.size()]);
        this.f13090f = uri.toString();
        this.f13087c = sliceSpec;
    }

    /* renamed from: b */
    public static void m11724b(StringBuilder sb, String[] strArr) {
        int length;
        if (strArr != null && (length = strArr.length) != 0) {
            sb.append('(');
            int i = length - 1;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(strArr[i2]);
                sb.append(", ");
            }
            sb.append(strArr[i]);
            sb.append(")");
        }
    }

    /* renamed from: c */
    static void m11725c(IconCompat iconCompat) {
        if (iconCompat.f5826b == 2 && iconCompat.mo5073a() == 0) {
            throw new IllegalArgumentException("Failed to add icon, invalid resource id: " + iconCompat.mo5073a());
        }
    }

    /* renamed from: a */
    public final String mo8591a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Slice ");
        String[] strArr = this.f13089e;
        if (strArr.length > 0) {
            m11724b(sb, strArr);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f13090f);
        sb.append("] {\n");
        String concat = str.concat("  ");
        int i = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f13088d;
            if (i < sliceItemArr.length) {
                sb.append(sliceItemArr[i].mo8598f(concat));
                i++;
            } else {
                sb.append(str);
                sb.append('}');
                return sb.toString();
            }
        }
    }

    public final String toString() {
        return mo8591a(BuildConfig.FLAVOR);
    }
}

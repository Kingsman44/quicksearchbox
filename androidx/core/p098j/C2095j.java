package androidx.core.p098j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.p097i.C1974i;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.core.j.j */
/* compiled from: PG */
final class C2095j implements C2094i {

    /* renamed from: a */
    private final ClipData f6007a;

    /* renamed from: b */
    private final int f6008b;

    /* renamed from: c */
    private final int f6009c;

    /* renamed from: d */
    private final Uri f6010d;

    /* renamed from: e */
    private final Bundle f6011e;

    /* renamed from: a */
    public final int mo5262a() {
        return this.f6009c;
    }

    /* renamed from: b */
    public final int mo5263b() {
        return this.f6008b;
    }

    /* renamed from: c */
    public final ClipData mo5264c() {
        return this.f6007a;
    }

    /* renamed from: d */
    public final ContentInfo mo5265d() {
        return null;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.f6007a.getDescription());
        sb.append(", source=");
        int i = this.f6008b;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
        sb.append(", flags=");
        if (this.f6009c != 0) {
            str = "FLAG_CONVERT_TO_PLAIN_TEXT";
        } else {
            str = String.valueOf(0);
        }
        sb.append(str);
        Uri uri = this.f6010d;
        String str3 = BuildConfig.FLAVOR;
        if (uri == null) {
            str2 = str3;
        } else {
            str2 = ", hasLinkUri(" + this.f6010d.toString().length() + ")";
        }
        sb.append(str2);
        if (this.f6011e != null) {
            str3 = ", hasExtras";
        }
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public C2095j(C2092g gVar) {
        ClipData clipData = gVar.f6001a;
        clipData.getClass();
        this.f6007a = clipData;
        int i = gVar.f6002b;
        C1974i.m5316d(i, 0, 5, "source");
        this.f6008b = i;
        this.f6009c = gVar.f6003c;
        this.f6010d = gVar.f6004d;
        this.f6011e = gVar.f6005e;
    }
}

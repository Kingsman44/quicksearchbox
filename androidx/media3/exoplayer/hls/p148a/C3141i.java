package androidx.media3.exoplayer.hls.p148a;

import androidx.media3.common.DrmInitData;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.a.i */
/* compiled from: PG */
public final class C3141i extends C3142j {

    /* renamed from: a */
    public final String f9257a;

    /* renamed from: b */
    public final List f9258b;

    public C3141i(String str, long j, long j2, String str2, String str3) {
        this(str, (C3141i) null, BuildConfig.FLAVOR, 0, -1, -9223372036854775807L, (DrmInitData) null, str2, str3, j, j2, false, C58485gu.m89845m());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3141i(String str, C3141i iVar, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, iVar, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.f9257a = str2;
        this.f9258b = C58485gu.m89842j(list);
    }
}

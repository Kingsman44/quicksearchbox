package androidx.media3.exoplayer.hls;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.p139c.C2862e;
import androidx.media3.exoplayer.p139c.C2868k;
import androidx.media3.exoplayer.p145h.C3094ce;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.hls.x */
/* compiled from: PG */
public final class C3184x extends C3094ce {

    /* renamed from: a */
    public DrmInitData f9481a;

    /* renamed from: k */
    private final Map f9482k;

    public C3184x(C3241g gVar, C2868k kVar, C2862e eVar, Map map) {
        super(gVar, kVar);
        this.f9482k = map;
    }

    /* renamed from: g */
    public final C2680x mo7071g(C2680x xVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.f9481a;
        if (drmInitData2 == null) {
            drmInitData2 = xVar.f7499q;
        }
        if (!(drmInitData2 == null || (drmInitData = (DrmInitData) this.f9482k.get(drmInitData2.f7048b)) == null)) {
            drmInitData2 = drmInitData;
        }
        Metadata metadata = xVar.f7494l;
        if (metadata != null) {
            int length = metadata.f7056a.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entry = metadata.f7056a[i2];
                if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f11490a)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    Metadata.Entry[] entryArr = new Metadata.Entry[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            entryArr[i < i2 ? i : i - 1] = metadata.f7056a[i];
                        }
                        i++;
                    }
                    metadata = new Metadata(-9223372036854775807L, entryArr);
                }
            }
            if (!(drmInitData2 == xVar.f7499q && metadata == xVar.f7494l)) {
                C2679w wVar = new C2679w(xVar);
                wVar.f7462n = drmInitData2;
                wVar.f7457i = metadata;
                xVar = new C2680x(wVar);
            }
            return super.mo7071g(xVar);
        }
        metadata = null;
        C2679w wVar2 = new C2679w(xVar);
        wVar2.f7462n = drmInitData2;
        wVar2.f7457i = metadata;
        xVar = new C2680x(wVar2);
        return super.mo7071g(xVar);
    }
}

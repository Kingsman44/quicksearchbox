package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;

/* compiled from: PG */
public abstract class SpliceCommand implements Metadata.Entry {
    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6067b(C2592as asVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo6068c() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(String.valueOf(getClass().getSimpleName()));
    }
}

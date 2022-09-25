package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;

/* compiled from: PG */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: f */
    public final String f11481f;

    public Id3Frame(String str) {
        this.f11481f = str;
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public /* synthetic */ void mo6067b(C2592as asVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo6068c() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f11481f;
    }
}

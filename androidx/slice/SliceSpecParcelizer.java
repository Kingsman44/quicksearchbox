package androidx.slice;

import androidx.versionedparcelable.C4265d;

/* compiled from: PG */
public final class SliceSpecParcelizer {
    public static SliceSpec read(C4265d dVar) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.f13104a = dVar.mo9109n(sliceSpec.f13104a, 1);
        sliceSpec.f13105b = dVar.mo9097b(sliceSpec.f13105b, 2);
        return sliceSpec;
    }

    public static void write(SliceSpec sliceSpec, C4265d dVar) {
        String str = sliceSpec.f13104a;
        dVar.mo9111p(1);
        dVar.mo9120y(str);
        int i = sliceSpec.f13105b;
        if (i != 1) {
            dVar.mo9111p(2);
            dVar.mo9117v(i);
        }
    }
}

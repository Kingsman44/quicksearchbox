package androidx.slice;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.C4265d;
import androidx.versionedparcelable.C4267f;
import java.util.ArrayList;

/* compiled from: PG */
public final class SliceItemHolderParcelizer {
    private static C4109h sBuilder = new C4109h();

    public static SliceItemHolder read(C4265d dVar) {
        SliceItemHolder sliceItemHolder;
        C4109h hVar = sBuilder;
        if (hVar.f13134a.size() > 0) {
            ArrayList arrayList = hVar.f13134a;
            sliceItemHolder = (SliceItemHolder) arrayList.remove(arrayList.size() - 1);
        } else {
            sliceItemHolder = new SliceItemHolder(hVar);
        }
        sliceItemHolder.f13097a = dVar.mo9105j(sliceItemHolder.f13097a, 1);
        sliceItemHolder.f13098b = dVar.mo9102g(sliceItemHolder.f13098b, 2);
        sliceItemHolder.f13099c = dVar.mo9109n(sliceItemHolder.f13099c, 3);
        sliceItemHolder.f13100d = dVar.mo9097b(sliceItemHolder.f13100d, 4);
        long j = sliceItemHolder.f13101e;
        if (dVar.mo9093D(5)) {
            j = dVar.mo9098c();
        }
        sliceItemHolder.f13101e = j;
        Bundle bundle = sliceItemHolder.f13102f;
        if (dVar.mo9093D(6)) {
            bundle = dVar.mo9099d();
        }
        sliceItemHolder.f13102f = bundle;
        return sliceItemHolder;
    }

    public static void write(SliceItemHolder sliceItemHolder, C4265d dVar) {
        C4267f fVar = sliceItemHolder.f13097a;
        if (fVar != null) {
            dVar.mo9111p(1);
            dVar.mo9090A(fVar);
        }
        Parcelable parcelable = sliceItemHolder.f13098b;
        if (parcelable != null) {
            dVar.mo9111p(2);
            dVar.mo9119x(parcelable);
        }
        String str = sliceItemHolder.f13099c;
        if (str != null) {
            dVar.mo9111p(3);
            dVar.mo9120y(str);
        }
        int i = sliceItemHolder.f13100d;
        if (i != 0) {
            dVar.mo9111p(4);
            dVar.mo9117v(i);
        }
        long j = sliceItemHolder.f13101e;
        if (j != 0) {
            dVar.mo9111p(5);
            dVar.mo9118w(j);
        }
        Bundle bundle = sliceItemHolder.f13102f;
        if (bundle != null) {
            dVar.mo9111p(6);
            dVar.mo9114s(bundle);
        }
    }
}

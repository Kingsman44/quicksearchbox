package com.bumptech.glide.load.p293a;

import android.util.Log;
import androidx.core.p097i.C1971f;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.data.C5932g;
import com.bumptech.glide.load.p299c.p305f.C5915e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.s */
/* compiled from: PG */
public final class C5726s {

    /* renamed from: a */
    public final C5915e f17277a;

    /* renamed from: b */
    public final C1971f f17278b;

    /* renamed from: c */
    private final Class f17279c;

    /* renamed from: d */
    private final List f17280d;

    /* renamed from: e */
    private final String f17281e;

    public C5726s(Class cls, Class cls2, Class cls3, List list, C5915e eVar, C1971f fVar) {
        this.f17279c = cls;
        this.f17280d = list;
        this.f17277a = eVar;
        this.f17278b = fVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        this.f17281e = "Failed DecodePath{" + simpleName + "->" + simpleName2 + "->" + simpleName3 + "}";
    }

    /* renamed from: a */
    public final C5679av mo12242a(C5932g gVar, int i, int i2, C5960s sVar, List list) {
        int size = this.f17280d.size();
        C5679av avVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C5962u uVar = (C5962u) this.f17280d.get(i3);
            try {
                if (uVar.mo12294b(gVar.mo12338a(), sVar)) {
                    avVar = uVar.mo12293a(gVar.mo12338a(), i, i2, sVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for ".concat(String.valueOf(String.valueOf(uVar))), e);
                }
                list.add(e);
            }
            if (avVar != null) {
                break;
            }
        }
        if (avVar != null) {
            return avVar;
        }
        throw new C5673ap(this.f17281e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17279c);
        String valueOf2 = String.valueOf(this.f17280d);
        String valueOf3 = String.valueOf(this.f17277a);
        return "DecodePath{ dataClass=" + valueOf + ", decoders=" + valueOf2 + ", transcoder=" + valueOf3 + "}";
    }
}

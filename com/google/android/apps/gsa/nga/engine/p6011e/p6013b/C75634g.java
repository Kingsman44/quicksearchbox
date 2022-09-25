package com.google.android.apps.gsa.nga.engine.p6011e.p6013b;

import android.media.AudioTrack;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.g */
/* compiled from: PG */
public final /* synthetic */ class C75634g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f209957a;

    public /* synthetic */ C75634g(String str) {
        this.f209957a = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = this.f209957a;
        AudioTrack audioTrack = (AudioTrack) obj;
        if (audioTrack != null) {
            return new C75633f(new C75632e(), audioTrack, str);
        }
        throw new Exception();
    }
}

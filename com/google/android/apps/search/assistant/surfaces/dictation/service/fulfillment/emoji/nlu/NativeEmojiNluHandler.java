package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu;

import com.google.android.apps.gsa.nga.engine.dictation.ac;
import com.google.android.apps.gsa.nga.engine.dictation.l;
import com.google.android.apps.gsa.nga.engine.dictation.n;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9452k.C125886a;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17196a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.learning.expander.pod.inferenceapi.core.C62019a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
final class NativeEmojiNluHandler extends C62019a implements C125723b {

    /* renamed from: a */
    private static final C59071e f346510a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.emoji.nlu.NativeEmojiNluHandler");

    private NativeEmojiNluHandler(long j, String str) {
        super(j, str);
    }

    /* renamed from: b */
    public static NativeEmojiNluHandler m205705b(ac acVar) {
        return new NativeEmojiNluHandler(initJni(acVar.toByteArray()), ((C17196a) C125886a.f346957a).f49938a);
    }

    private static native long initJni(byte[] bArr);

    private native byte[] nativeRunNlu(long j, byte[] bArr);

    /* renamed from: a */
    public final n mo107091a(l lVar) {
        C47558bi a;
        if (!this.f167591d) {
            C47558bi a2 = C47831fm.m85006a("SD.NativeEmojiNluHandler.RunNlu");
            try {
                byte[] nativeRunNlu = nativeRunNlu(this.f167589b, lVar.toByteArray());
                a2.close();
                try {
                    a = C47831fm.m85006a("SD.NativeEmojiNluHandler.ParseOutput");
                    n parseFrom = C62942bv.parseFrom((C62942bv) n.b, nativeRunNlu, C62921ba.m95368a());
                    a.close();
                    return parseFrom;
                } catch (C62974ct e) {
                    ((C59052c) ((C59052c) ((C59052c) f346510a.mo56226d()).mo56382g(e)).mo56372aa(36614)).mo56386p("Fail to parse EmojiNluResponse from byte[] returned by native method [SD]");
                    return n.b;
                } catch (Throwable th) {
                    C125728g.m205711a(th, th);
                }
            } catch (Throwable th2) {
                C125728g.m205711a(th, th2);
            }
        } else {
            throw new IllegalStateException("IllegalState! runNlu() should never be called on a closed NativeEmojiNluHandler.");
        }
        throw th;
        throw th;
    }

    /* access modifiers changed from: protected */
    public native void deinitJni(long j);
}

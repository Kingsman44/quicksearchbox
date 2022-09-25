package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.nga.engine.dictation.ae;
import com.google.android.apps.gsa.nga.engine.dictation.af;
import com.google.android.apps.gsa.nga.engine.dictation.ag;
import com.google.android.apps.gsa.nga.engine.dictation.y;
import com.google.android.apps.gsa.nga.engine.dictation.z;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.learning.expander.pod.inferenceapi.core.C62019a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.nio.MappedByteBuffer;

/* compiled from: PG */
final class NativeFormatterImpl extends C62019a implements C125472ah {

    /* renamed from: a */
    private static final C59071e f345997a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.NativeFormatterImpl");
    private final MappedByteBuffer capitalizationModelBuffer;
    private final MappedByteBuffer punctuationModelBuffer;
    private final MappedByteBuffer spokenPunctuationModelBuffer;

    public NativeFormatterImpl(String str, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, MappedByteBuffer mappedByteBuffer3, long j) {
        super(j, str);
        this.punctuationModelBuffer = mappedByteBuffer;
        this.capitalizationModelBuffer = mappedByteBuffer2;
        this.spokenPunctuationModelBuffer = mappedByteBuffer3;
    }

    static native long initJniWithByteBuffer(String str, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, byte[] bArr, MappedByteBuffer mappedByteBuffer3, byte[] bArr2, byte[] bArr3, boolean z);

    private native byte[] interactiveFormatJni(long j, byte[] bArr, byte[] bArr2);

    /* renamed from: a */
    public final synchronized ag mo106978a(ae aeVar, y yVar) {
        C47558bi a;
        if (this.f167591d) {
            ((C59052c) ((C59052c) f345997a.mo56226d()).mo56372aa(36595)).mo56386p("IllegalState! formatInteractiveInput() should never be called on a closed NativeFormatterImpl. [SD]");
            af createBuilder = ag.h.createBuilder();
            z zVar = z.c;
            createBuilder.copyOnWrite();
            createBuilder.instance.g = zVar.getNumber();
            return createBuilder.build();
        }
        C47558bi a2 = C47831fm.m85006a("SD.NativeFormatter.Format");
        try {
            byte[] interactiveFormatJni = interactiveFormatJni(this.f167589b, aeVar.toByteArray(), yVar.toByteArray());
            a2.close();
            try {
                a = C47831fm.m85006a("SD.NativeFormatter.ParseOutput");
                ag parseFrom = C62942bv.parseFrom((C62942bv) ag.h, interactiveFormatJni, C62921ba.m95368a());
                a.close();
                return parseFrom;
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f345997a.mo56226d()).mo56382g(e)).mo56372aa(36594)).mo56386p("Fail to parse InteractiveFormattingOutput from byte[] returned by native method [SD]");
                af createBuilder2 = ag.h.createBuilder();
                z zVar2 = z.e;
                createBuilder2.copyOnWrite();
                createBuilder2.instance.g = zVar2.getNumber();
                return createBuilder2.build();
            } catch (Throwable th) {
                C125477am.m205456a(th, th);
            }
        } catch (Throwable th2) {
            C125477am.m205456a(th, th2);
        }
        throw th;
        throw th;
    }

    /* access modifiers changed from: protected */
    public native void deinitJni(long j);
}

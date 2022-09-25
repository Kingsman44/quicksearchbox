package com.google.audio.ambientmusic;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public class SoundSearchFingerprinter {

    /* renamed from: a */
    private static final C59071e f143288a = C59071e.m91332i("com.google.audio.ambientmusic.SoundSearchFingerprinter");

    /* renamed from: a */
    public static final C54577f m87489a(short[] sArr, C54575d dVar) {
        try {
            byte[] soundSearchFingerprint = soundSearchFingerprint(sArr, dVar.toByteArray());
            if (soundSearchFingerprint == null) {
                return null;
            }
            return (C54577f) C62942bv.parseFrom((C62942bv) C54577f.f143297b, soundSearchFingerprint, C62921ba.f169869a);
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f143288a.mo56225c()).mo56382g(e)).mo56372aa(54866)).mo56386p("Failed to parse output proto");
            return null;
        } catch (Exception | UnsatisfiedLinkError e2) {
            ((C59052c) ((C59052c) ((C59052c) f143288a.mo56225c()).mo56382g(e2)).mo56372aa(54867)).mo56386p("Failed to load native lib");
            return null;
        }
    }

    private static native byte[] soundSearchFingerprint(short[] sArr, byte[] bArr);
}

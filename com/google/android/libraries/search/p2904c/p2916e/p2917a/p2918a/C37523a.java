package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2918a;

import android.content.AttributionSource;
import android.content.Context;
import android.content.ContextParams;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.os.Build;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.p2905a.C37323b;
import com.google.android.libraries.search.p2904c.p2905a.C37324c;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.C37522a;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c.C37535b;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37827a;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2951n.C37902d;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.e.a.a.a */
/* compiled from: PG */
public final class C37523a implements C37522a {

    /* renamed from: a */
    private static final C59071e f99693a = C59071e.m91331h();

    /* renamed from: b */
    private final C37324c f99694b;

    /* renamed from: c */
    private final Context f99695c;

    public C37523a(C37324c cVar, Context context) {
        C69664n.m101061g(cVar, "attributionSourceStore");
        C69664n.m101061g(context, "context");
        this.f99694b = cVar;
        this.f99695c = context;
    }

    /* renamed from: b */
    private static final AudioRecord m66530b(C37535b bVar) {
        C59071e eVar = f99693a;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
        cVar.mo56379ah(new C59094n(52696));
        cVar.mo56386p("#audio# createAudioRecord");
        try {
            C37360ay ayVar = bVar.f99723d;
            if (ayVar == null) {
                ayVar = C37360ay.f99224l;
            }
            int i = ayVar.f99227b;
            C37360ay ayVar2 = bVar.f99723d;
            int i2 = (ayVar2 == null ? C37360ay.f99224l : ayVar2).f99228c;
            int i3 = (ayVar2 == null ? C37360ay.f99224l : ayVar2).f99229d;
            int i4 = (ayVar2 == null ? C37360ay.f99224l : ayVar2).f99230e;
            if (ayVar2 == null) {
                ayVar2 = C37360ay.f99224l;
            }
            AudioRecord audioRecord = new AudioRecord(i, i2, i3, i4, C37827a.m66750a(ayVar2));
            if (audioRecord.getState() == 1) {
                return audioRecord;
            }
            C59052c cVar2 = (C59052c) eVar.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
            cVar2.mo56379ah(new C59094n(52697));
            cVar2.mo56386p("#audio# createAudioRecord failed: audio record state initialized error.");
            audioRecord.release();
            throw new C37902d("#createAudioRecord failed: audio record state initialized error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT));
        } catch (IllegalArgumentException e) {
            C59052c cVar3 = (C59052c) f99693a.mo56226d();
            cVar3.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
            cVar3.mo56379ah(new C59094n(52698));
            cVar3.mo56386p("#audio# createAudioRecord failed: error creating audio record.");
            throw new C37902d("#createAudioRecord failed: error creating audio record.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT), e);
        }
    }

    /* renamed from: a */
    public final AudioRecord mo41005a(C37535b bVar) {
        C37323b bVar2;
        C39226b bVar3;
        C69664n.m101061g(bVar, "params");
        int i = bVar.f99721b;
        int i2 = i != 0 ? i != 4 ? i != 6 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C59071e eVar = f99693a;
            C59052c cVar = (C59052c) eVar.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
            cVar.mo56379ah(new C59094n(52699));
            cVar.mo56386p("#audio# createAudioRecordWithAttribution");
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    C37324c cVar2 = this.f99694b;
                    if (bVar.f99721b == 4) {
                        bVar2 = (C37323b) bVar.f99722c;
                    } else {
                        bVar2 = C37323b.f99159c;
                    }
                    C58833ax b = cVar2.mo40881b(bVar2);
                    if (b.mo56113h()) {
                        ContextParams build = new ContextParams.Builder().setNextAttributionSource((AttributionSource) b.mo56107c()).build();
                        C69664n.m101060f(build, "Builder().setNextAttribu…onOptional.get()).build()");
                        AudioRecord.Builder context = new AudioRecord.Builder().setContext(this.f99695c.createContext(build));
                        C37360ay ayVar = bVar.f99723d;
                        if (ayVar == null) {
                            ayVar = C37360ay.f99224l;
                        }
                        AudioRecord.Builder audioSource = context.setAudioSource(ayVar.f99227b);
                        AudioFormat.Builder builder = new AudioFormat.Builder();
                        C37360ay ayVar2 = bVar.f99723d;
                        if (ayVar2 == null) {
                            ayVar2 = C37360ay.f99224l;
                        }
                        AudioFormat.Builder channelMask = builder.setChannelMask(ayVar2.f99229d);
                        C37360ay ayVar3 = bVar.f99723d;
                        if (ayVar3 == null) {
                            ayVar3 = C37360ay.f99224l;
                        }
                        AudioFormat.Builder encoding = channelMask.setEncoding(ayVar3.f99230e);
                        C37360ay ayVar4 = bVar.f99723d;
                        if (ayVar4 == null) {
                            ayVar4 = C37360ay.f99224l;
                        }
                        AudioRecord.Builder audioFormat = audioSource.setAudioFormat(encoding.setSampleRate(ayVar4.f99228c).build());
                        C37360ay ayVar5 = bVar.f99723d;
                        if (ayVar5 == null) {
                            ayVar5 = C37360ay.f99224l;
                        }
                        AudioRecord build2 = audioFormat.setBufferSizeInBytes(C37827a.m66750a(ayVar5)).build();
                        if (build2.getState() == 1) {
                            C69664n.m101060f(build2, "{\n      if (Build.VERSIO…}\n      audioRecord\n    }");
                            return build2;
                        }
                        C59052c cVar3 = (C59052c) eVar.mo56226d();
                        cVar3.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
                        cVar3.mo56379ah(new C59094n(52700));
                        cVar3.mo56386p("#audio# createAudioRecordWithAttribution failed: audio record state initialized error.");
                        build2.release();
                        throw new C37902d("#createAudioRecordWithAttribution failed: audio record state initialized error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT));
                    }
                    throw new C37902d("#createAudioRecordWithAttribution failed: missing source attribution.", C37846as.m66803i(C37519dz.FAILED_OPENING_MISSING_SOURCE_ATTRIBUTION));
                }
                throw new C37902d("#createAudioRecordWithAttribution failed: outdated Android SDK.", C37846as.m66803i(C37519dz.FAILED_OPENING_SOURCE_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK));
            } catch (IllegalArgumentException e) {
                throw new C37902d("#createAudioRecordWithAttribution failed: invalid media sync event.", C37846as.m66803i(C37519dz.FAILED_OPENING_SOURCE_ATTRIBUTION_EXCEPTION), e);
            }
        } else if (i3 == 1) {
            C59071e eVar2 = f99693a;
            C59052c cVar4 = (C59052c) eVar2.mo56224b();
            cVar4.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
            cVar4.mo56379ah(new C59094n(52701));
            cVar4.mo56386p("#audio# createAudioRecordWithAttributionId");
            try {
                if (Build.VERSION.SDK_INT < 31) {
                    return m66530b(bVar);
                }
                AudioRecord.Builder builder2 = new AudioRecord.Builder();
                Context context2 = this.f99695c;
                if (bVar.f99721b == 6) {
                    bVar3 = C39226b.m68655a(((Integer) bVar.f99722c).intValue());
                    if (bVar3 == null) {
                        bVar3 = C39226b.TAG_DO_NOT_USE;
                    }
                } else {
                    bVar3 = C39226b.TAG_DO_NOT_USE;
                }
                AudioRecord.Builder context3 = builder2.setContext(C39239a.m68666a(context2, bVar3));
                C37360ay ayVar6 = bVar.f99723d;
                if (ayVar6 == null) {
                    ayVar6 = C37360ay.f99224l;
                }
                AudioRecord.Builder audioSource2 = context3.setAudioSource(ayVar6.f99227b);
                AudioFormat.Builder builder3 = new AudioFormat.Builder();
                C37360ay ayVar7 = bVar.f99723d;
                if (ayVar7 == null) {
                    ayVar7 = C37360ay.f99224l;
                }
                AudioFormat.Builder channelMask2 = builder3.setChannelMask(ayVar7.f99229d);
                C37360ay ayVar8 = bVar.f99723d;
                if (ayVar8 == null) {
                    ayVar8 = C37360ay.f99224l;
                }
                AudioFormat.Builder encoding2 = channelMask2.setEncoding(ayVar8.f99230e);
                C37360ay ayVar9 = bVar.f99723d;
                if (ayVar9 == null) {
                    ayVar9 = C37360ay.f99224l;
                }
                AudioRecord.Builder audioFormat2 = audioSource2.setAudioFormat(encoding2.setSampleRate(ayVar9.f99228c).build());
                C37360ay ayVar10 = bVar.f99723d;
                if (ayVar10 == null) {
                    ayVar10 = C37360ay.f99224l;
                }
                AudioRecord build3 = audioFormat2.setBufferSizeInBytes(C37827a.m66750a(ayVar10)).build();
                if (build3.getState() == 1) {
                    C69664n.m101060f(build3, "{\n      if (Build.VERSIO…}\n      audioRecord\n    }");
                    return build3;
                }
                C59052c cVar5 = (C59052c) eVar2.mo56226d();
                cVar5.mo56378ag(C58975e.f156826a, "ALT.AudioRecordFactory");
                cVar5.mo56379ah(new C59094n(52702));
                cVar5.mo56386p("#audio# createAudioRecordWithAttributionId failed: audio record state initialized error.");
                build3.release();
                throw new C37902d("#createAudioRecordWithAttributionId failed: audio record state initialized error.", C37846as.m66803i(C37519dz.FAILED_OPENING_ERROR_INIT));
            } catch (IllegalArgumentException e2) {
                throw new C37902d("#createAudioRecordWithAttributionId failed: error creating audio record.", C37846as.m66803i(C37519dz.FAILED_OPENING_ID_ATTRIBUTION_UNSUPPORTED_AUDIO_SDK), e2);
            }
        } else if (i3 == 2) {
            return m66530b(bVar);
        } else {
            throw new C69677g();
        }
    }
}

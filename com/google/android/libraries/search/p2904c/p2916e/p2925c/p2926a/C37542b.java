package com.google.android.libraries.search.p2904c.p2916e.p2925c.p2926a;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37359ax;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37566eg;
import com.google.android.libraries.search.p2904c.C37567eh;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.C37593fe;
import com.google.android.libraries.search.p2904c.C37595fg;
import com.google.android.libraries.search.p2904c.C37825m;
import com.google.android.libraries.search.p2904c.C37956r;
import com.google.android.libraries.search.p2904c.C37967s;
import com.google.android.libraries.search.p2904c.C38112u;
import com.google.android.libraries.search.p2904c.C38119v;
import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.android.libraries.search.p2904c.p2916e.p2917a.p2922c.C37535b;
import com.google.android.libraries.search.p2904c.p2942m.p2948e.C37887a;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.c.e.c.a.b */
/* compiled from: PG */
public final class C37542b implements C37559f {

    /* renamed from: a */
    private static final C59071e f99735a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.a.b");

    /* renamed from: b */
    private final AtomicBoolean f99736b = new AtomicBoolean(false);

    /* renamed from: c */
    private final AudioRecord f99737c;

    /* renamed from: d */
    private final C38281b f99738d;

    /* renamed from: e */
    private final C37966b f99739e;

    /* renamed from: f */
    private final C58833ax f99740f;

    /* renamed from: g */
    private final C21370a f99741g;

    /* renamed from: h */
    private final int f99742h;

    /* renamed from: i */
    private long f99743i;

    public C37542b(AudioRecord audioRecord, C37535b bVar, C58833ax axVar, C38281b bVar2, C37966b bVar3, C21370a aVar) {
        this.f99737c = audioRecord;
        axVar.mo56113h();
        this.f99740f = axVar;
        this.f99738d = bVar2;
        this.f99739e = bVar3;
        this.f99741g = aVar;
        C37360ay ayVar = bVar.f99723d;
        C37359ax axVar2 = (ayVar == null ? C37360ay.f99224l : ayVar).f99235j;
        int i = (axVar2 == null ? C37359ax.f99220b : axVar2).f99222a;
        if (i < 1000) {
            ((C59052c) ((C59052c) f99735a.mo56226d()).mo56372aa(52745)).mo56387q("#audio# Timestamp polling interval set to a value smaller than minimum value %d, using minimum value.", 1000);
        }
        int max = Math.max(1000, i);
        this.f99742h = max;
        this.f99743i = aVar.mo26871c() - ((long) max);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = this.f99737c.read(bArr, 0, i2);
        if (read < -1 && this.f99736b.compareAndSet(false, true)) {
            C38281b bVar = this.f99738d;
            C37593fe feVar = (C37593fe) C37595fg.f99904g.createBuilder();
            C37566eg egVar = (C37566eg) C37567eh.f99829f.createBuilder();
            C37589fa faVar = C37589fa.OUTCOME_BUFFER_READ_ERROR;
            egVar.copyOnWrite();
            C37567eh ehVar = (C37567eh) egVar.instance;
            ehVar.f99832b = faVar.f99887l;
            ehVar.f99831a |= 1;
            egVar.copyOnWrite();
            C37567eh ehVar2 = (C37567eh) egVar.instance;
            ehVar2.f99831a |= 8;
            ehVar2.f99835e = read;
            C37567eh ehVar3 = (C37567eh) egVar.build();
            feVar.copyOnWrite();
            C37595fg fgVar = (C37595fg) feVar.instance;
            ehVar3.getClass();
            fgVar.f99908c = ehVar3;
            fgVar.f99907b = 3;
            bVar.mo41352f((C37595fg) feVar.build());
            this.f99739e.mo41177j(read);
        }
        if (this.f99740f.mo56113h()) {
            long c = this.f99741g.mo26871c();
            if (c - this.f99743i >= ((long) this.f99742h)) {
                this.f99743i = c;
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                if (this.f99737c.getTimestamp(audioTimestamp, 1) == 0) {
                    C37825m mVar = (C37825m) C38119v.f100992c.createBuilder();
                    C37956r rVar = (C37956r) C37967s.f100592e.createBuilder();
                    long j = audioTimestamp.nanoTime;
                    rVar.copyOnWrite();
                    C37967s sVar = (C37967s) rVar.instance;
                    sVar.f100594a |= 1;
                    sVar.f100595b = j;
                    long j2 = audioTimestamp.framePosition;
                    rVar.copyOnWrite();
                    C37967s sVar2 = (C37967s) rVar.instance;
                    sVar2.f100594a |= 2;
                    sVar2.f100596c = j2;
                    C38112u uVar = C38112u.ANDROID_TIMESTAMP;
                    rVar.copyOnWrite();
                    C37967s sVar3 = (C37967s) rVar.instance;
                    sVar3.f100597d = uVar.f100989d;
                    sVar3.f100594a |= 4;
                    mVar.copyOnWrite();
                    C38119v vVar = (C38119v) mVar.instance;
                    C37967s sVar4 = (C37967s) rVar.build();
                    sVar4.getClass();
                    vVar.f100995b = sVar4;
                    vVar.f100994a = 1;
                    ((C37887a) this.f99740f.mo56107c()).mo41128b((C38119v) mVar.build());
                } else {
                    ((C59052c) ((C59052c) f99735a.mo56224b()).mo56372aa(52746)).mo56386p("#audio# AudioRecord::getTimestamp returned ERROR_INVALID_OPERATION");
                }
            }
        }
        if (read >= 0) {
            return read;
        }
        return -1;
    }
}

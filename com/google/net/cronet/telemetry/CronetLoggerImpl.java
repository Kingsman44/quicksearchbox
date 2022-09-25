package com.google.net.cronet.telemetry;

import android.util.Log;
import android.util.StatsEvent;
import android.util.StatsLog;
import com.google.common.p4535g.C59203do;
import com.google.net.cronet.telemetry.p4729a.C62725a;
import com.google.net.cronet.telemetry.p4729a.C62726b;
import com.google.net.cronet.telemetry.p4729a.C62727c;
import com.google.net.cronet.telemetry.p4729a.C62728d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.C72536r;
import org.chromium.net.impl.C72537s;
import org.chromium.net.impl.C72538t;
import org.chromium.net.impl.C72539u;
import org.json.JSONException;
import p3186j$.nio.charset.StandardCharsets;

/* compiled from: PG */
public class CronetLoggerImpl extends C72539u {

    /* renamed from: a */
    private static final String f169425a = "CronetLoggerImpl";

    /* renamed from: b */
    private final AtomicInteger f169426b = new AtomicInteger();

    /* renamed from: c */
    private final C62727c f169427c;

    public CronetLoggerImpl(int i) {
        C62727c cVar = new C62727c(i);
        this.f169427c = cVar;
    }

    /* renamed from: c */
    private static long m94933c(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8))).getLong();
            } catch (NoSuchAlgorithmException e) {
                Log.d(f169425a, "Error while encoding negotiated protocol", e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo58624a(int i, C72537s sVar) {
        int i2;
        int i3;
        int i4;
        C72537s sVar2 = sVar;
        if (!this.f169427c.mo58627a()) {
            this.f169426b.incrementAndGet();
            return;
        }
        long j = (long) i;
        int andSet = this.f169426b.getAndSet(0);
        long j2 = sVar2.f193019a;
        C62728d.m94940a(j2, "Request header size is negative");
        double d = (double) j2;
        Double.isNaN(d);
        double d2 = d / 1024.0d;
        if (C62728d.m94941b(d2, 0, 1)) {
            i2 = 1;
        } else {
            i2 = C62728d.m94941b(d2, 1, 10) ? 2 : C62728d.m94941b(d2, 10, 25) ? 3 : C62728d.m94941b(d2, 25, 50) ? 4 : C62728d.m94941b(d2, 50, 100) ? 5 : 6;
        }
        long j3 = sVar2.f193020b;
        C62728d.m94940a(j3, "Request body size is negative");
        double d3 = (double) j3;
        Double.isNaN(d3);
        double d4 = d3 / 1024.0d;
        if (d4 == C59203do.f157270a) {
            i3 = 1;
        } else if (d4 <= C59203do.f157270a || d4 >= 10.0d) {
            try {
                i3 = C62728d.m94941b(d4, 10, 50) ? 3 : C62728d.m94941b(d4, 50, 200) ? 4 : C62728d.m94941b(d4, 200, 500) ? 5 : C62728d.m94941b(d4, 500, 1000) ? 6 : C62728d.m94941b(d4, 1000, 5000) ? 7 : 8;
            } catch (RuntimeException e) {
                this.f169426b.addAndGet(andSet);
                Log.d(f169425a, String.format("Failed to log cronet traffic sample for CronetEngine %s: %s", new Object[]{Long.valueOf(j), e.getMessage()}));
                return;
            }
        } else {
            i3 = 2;
        }
        long j4 = sVar2.f193021c;
        C62728d.m94940a(j4, "Response header size is negative");
        double d5 = (double) j4;
        Double.isNaN(d5);
        double d6 = d5 / 1024.0d;
        int i5 = 1;
        if (!C62728d.m94941b(d6, 0, 1)) {
            i5 = C62728d.m94941b(d6, 1, 10) ? 2 : C62728d.m94941b(d6, 10, 25) ? 3 : C62728d.m94941b(d6, 25, 50) ? 4 : C62728d.m94941b(d6, 50, 100) ? 5 : 6;
        }
        long j5 = sVar2.f193022d;
        C62728d.m94940a(j5, "Response body size is negative");
        double d7 = (double) j5;
        Double.isNaN(d7);
        double d8 = d7 / 1024.0d;
        if (d8 == C59203do.f157270a) {
            i4 = 1;
        } else {
            i4 = (d8 <= C59203do.f157270a || d8 >= 10.0d) ? C62728d.m94941b(d8, 10, 50) ? 3 : C62728d.m94941b(d8, 50, 200) ? 4 : C62728d.m94941b(d8, 200, 500) ? 5 : C62728d.m94941b(d8, 500, 1000) ? 6 : C62728d.m94941b(d8, 1000, 5000) ? 7 : 8 : 2;
        }
        int i6 = sVar2.f193023e;
        long c = m94933c(sVar2.f193026h);
        int millis = (int) sVar2.f193024f.toMillis();
        int millis2 = (int) sVar2.f193025g.toMillis();
        boolean z = sVar2.f193027i;
        boolean z2 = sVar2.f193028j;
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(209001);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i5);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i6);
        newBuilder.writeLong(c);
        newBuilder.writeInt(millis);
        newBuilder.writeInt(millis2);
        newBuilder.writeBoolean(z);
        newBuilder.writeBoolean(z2);
        newBuilder.writeInt(andSet);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    /* renamed from: b */
    public final void mo58625b(int i, C72536r rVar, C72538t tVar, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        Boolean bool;
        C72536r rVar2 = rVar;
        C72538t tVar2 = tVar;
        long j = (long) i;
        try {
            C62726b bVar = new C62726b(rVar2.f193016f);
            int i6 = tVar2.f193029a;
            int i7 = tVar2.f193030b;
            int i8 = tVar2.f193031c;
            int i9 = tVar2.f193032d;
            int i10 = i2 - 1;
            int i11 = i10 != 1 ? i10 != 2 ? 3 : 2 : 1;
            boolean z3 = rVar2.f193014d;
            boolean z4 = rVar2.f193013c;
            int i12 = rVar2.f193015e;
            if (i12 != 0) {
                z = z4;
                i3 = i12 != 1 ? i12 != 2 ? 4 : 3 : 2;
            } else {
                z = z4;
                i3 = 1;
            }
            boolean z5 = rVar2.f193011a;
            boolean z6 = rVar2.f193012b;
            boolean z7 = rVar2.f193017g;
            int i13 = rVar2.f193018h;
            int i14 = i3;
            String str = (String) bVar.mo58626a("QUIC", "connection_options", (Object) null, String.class);
            if (!C62726b.m94937b(str)) {
                ArrayList arrayList = new ArrayList();
                String[] split = str.split(",", -1);
                int length = split.length;
                z2 = z3;
                int i15 = 0;
                while (i15 < length) {
                    int i16 = length;
                    String str2 = split[i15];
                    String[] strArr = split;
                    int i17 = i11;
                    if (C62726b.f169429b.contains(str2.toUpperCase(Locale.ROOT).trim())) {
                        arrayList.add(str2);
                    }
                    i15++;
                    length = i16;
                    split = strArr;
                    i11 = i17;
                }
                i4 = i11;
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    CharSequence charSequence = (CharSequence) it.next();
                    while (true) {
                        sb.append(charSequence);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append(",");
                        charSequence = (CharSequence) it.next();
                    }
                }
                str = sb.toString();
            } else {
                i4 = i11;
                z2 = z3;
            }
            String str3 = str;
            int a = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "store_server_configs_in_properties", (Object) null, Boolean.class)) - 1;
            int intValue = ((Integer) bVar.mo58626a("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
            int intValue2 = ((Integer) bVar.mo58626a("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
            int a2 = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "goaway_sessions_on_ip_change", (Object) null, Boolean.class)) - 1;
            int a3 = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "close_sessions_on_ip_change", (Object) null, Boolean.class)) - 1;
            int a4 = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "migrate_sessions_on_network_change_v2", (Object) null, Boolean.class)) - 1;
            int a5 = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "migrate_sessions_early_v2", (Object) null, Boolean.class)) - 1;
            int a6 = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "disable_bidirectional_streams", (Object) null, Boolean.class)) - 1;
            int intValue3 = ((Integer) bVar.mo58626a("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
            int intValue4 = ((Integer) bVar.mo58626a("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
            int a7 = C62725a.m94936a((Boolean) bVar.mo58626a("QUIC", "enable_socket_recv_optimization", (Object) null, Boolean.class)) - 1;
            int a8 = C62725a.m94936a((Boolean) bVar.mo58626a("AsyncDNS", "enable", (Object) null, Boolean.class)) - 1;
            int a9 = C62725a.m94936a((Boolean) bVar.mo58626a("StaleDNS", "enable", (Object) null, Boolean.class)) - 1;
            int intValue5 = ((Integer) bVar.mo58626a("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
            int intValue6 = ((Integer) bVar.mo58626a("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
            int intValue7 = ((Integer) bVar.mo58626a("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
            int a10 = C62725a.m94936a((Boolean) bVar.mo58626a("StaleDNS", "allow_other_network", (Object) null, Boolean.class)) - 1;
            int a11 = C62725a.m94936a((Boolean) bVar.mo58626a("StaleDNS", "persist_to_disk", (Object) null, Boolean.class)) - 1;
            int intValue8 = ((Integer) bVar.mo58626a("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
            int a12 = C62725a.m94936a((Boolean) bVar.mo58626a("StaleDNS", "use_stale_on_name_not_resolved", (Object) null, Boolean.class)) - 1;
            try {
                bool = Boolean.class.cast(bVar.f169430c.get("disable_ipv6_on_wifi"));
                i5 = a12;
            } catch (ClassCastException | JSONException e) {
                i5 = a12;
                Log.d(C62726b.f169428a, String.format("Failed to get %s options: %s", new Object[]{"disable_ipv6_on_wifi", e.getMessage()}));
                bool = null;
            }
            StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
            newBuilder.setAtomId(209000);
            newBuilder.writeLong(j);
            newBuilder.writeInt(i6);
            newBuilder.writeInt(i7);
            newBuilder.writeInt(i8);
            newBuilder.writeInt(i9);
            newBuilder.writeInt(i4);
            newBuilder.writeBoolean(z2);
            newBuilder.writeBoolean(z);
            newBuilder.writeInt(i14);
            newBuilder.writeBoolean(z5);
            newBuilder.writeBoolean(z6);
            newBuilder.writeBoolean(z7);
            newBuilder.writeInt(i13);
            newBuilder.writeString(str3);
            newBuilder.writeInt(a);
            newBuilder.writeInt(intValue);
            newBuilder.writeInt(intValue2);
            newBuilder.writeInt(a2);
            newBuilder.writeInt(a3);
            newBuilder.writeInt(a4);
            newBuilder.writeInt(a5);
            newBuilder.writeInt(a6);
            newBuilder.writeInt(intValue3);
            newBuilder.writeInt(intValue4);
            newBuilder.writeInt(a7);
            newBuilder.writeInt(a8);
            newBuilder.writeInt(a9);
            newBuilder.writeInt(intValue5);
            newBuilder.writeInt(intValue6);
            newBuilder.writeInt(intValue7);
            newBuilder.writeInt(a10);
            newBuilder.writeInt(a11);
            newBuilder.writeInt(intValue8);
            newBuilder.writeInt(i5);
            newBuilder.writeInt(C62725a.m94936a(bool) - 1);
            newBuilder.usePooledBuffer();
            StatsLog.write(newBuilder.build());
        } catch (RuntimeException e2) {
            Log.d(f169425a, String.format("Failed to log CronetEngine:%s creation: %s", new Object[]{Long.valueOf(j), e2.getMessage()}));
        }
    }
}

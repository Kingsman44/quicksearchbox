package androidx.media3.exoplayer.dash.p141a;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.p144g.C3002a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.dash.a.c */
/* compiled from: PG */
public final class C2912c implements C3002a {

    /* renamed from: a */
    public final long f8316a;

    /* renamed from: b */
    public final long f8317b;

    /* renamed from: c */
    public final long f8318c;

    /* renamed from: d */
    public final boolean f8319d;

    /* renamed from: e */
    public final long f8320e;

    /* renamed from: f */
    public final long f8321f;

    /* renamed from: g */
    public final long f8322g;

    /* renamed from: h */
    public final long f8323h;

    /* renamed from: i */
    public final C2932w f8324i;

    /* renamed from: j */
    public final C2929t f8325j;

    /* renamed from: k */
    public final Uri f8326k;

    /* renamed from: l */
    public final C2918i f8327l;

    /* renamed from: m */
    private final List f8328m;

    public C2912c(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C2918i iVar, C2932w wVar, C2929t tVar, Uri uri, List list) {
        this.f8316a = j;
        this.f8317b = j2;
        this.f8318c = j3;
        this.f8319d = z;
        this.f8320e = j4;
        this.f8321f = j5;
        this.f8322g = j6;
        this.f8323h = j7;
        this.f8327l = iVar;
        this.f8324i = wVar;
        this.f8326k = uri;
        this.f8325j = tVar;
        this.f8328m = list;
    }

    /* renamed from: a */
    public final int mo6764a() {
        return this.f8328m.size();
    }

    /* renamed from: b */
    public final long mo6765b(int i) {
        if (i != this.f8328m.size() - 1) {
            return ((C2917h) this.f8328m.get(i + 1)).f8351b - ((C2917h) this.f8328m.get(i)).f8351b;
        }
        long j = this.f8317b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - ((C2917h) this.f8328m.get(i)).f8351b;
    }

    /* renamed from: c */
    public final C2917h mo6766c(int i) {
        return (C2917h) this.f8328m.get(i);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo6767d(List list) {
        C2912c cVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (i < mo6764a()) {
            if (((StreamKey) linkedList.peek()).f7058a != i) {
                long b = cVar.mo6765b(i);
                if (b != -9223372036854775807L) {
                    j += b;
                }
            } else {
                C2917h c = cVar.mo6766c(i);
                List list2 = c.f8352c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.f7058a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.f7059b;
                    C2910a aVar = (C2910a) list2.get(i3);
                    List list3 = aVar.f8308c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((C2922m) list3.get(streamKey.f7060c));
                        streamKey = (StreamKey) linkedList.poll();
                        if (!(streamKey.f7058a == i2 && streamKey.f7059b == i3)) {
                            List list4 = list2;
                            arrayList2.add(new C2910a(aVar.f8306a, aVar.f8307b, arrayList3, aVar.f8309d, aVar.f8310e, aVar.f8311f));
                        }
                        arrayList3.add((C2922m) list3.get(streamKey.f7060c));
                        streamKey = (StreamKey) linkedList.poll();
                        break;
                    } while (streamKey.f7059b == i3);
                    List list42 = list2;
                    arrayList2.add(new C2910a(aVar.f8306a, aVar.f8307b, arrayList3, aVar.f8309d, aVar.f8310e, aVar.f8311f));
                    if (streamKey.f7058a != i2) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new C2917h(c.f8350a, c.f8351b - j, arrayList2, c.f8353d));
            }
            i++;
            cVar = this;
        }
        long j2 = cVar.f8317b;
        return new C2912c(cVar.f8316a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, cVar.f8318c, cVar.f8319d, cVar.f8320e, cVar.f8321f, cVar.f8322g, cVar.f8323h, cVar.f8327l, cVar.f8324i, cVar.f8325j, cVar.f8326k, arrayList);
    }
}

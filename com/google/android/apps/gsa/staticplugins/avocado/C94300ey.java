package com.google.android.apps.gsa.staticplugins.avocado;

import android.media.Image;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ey */
/* compiled from: PG */
public final class C94300ey {

    /* renamed from: b */
    private static final C59071e f263512b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.ey");

    /* renamed from: a */
    public final Image f263513a;

    /* renamed from: c */
    private C58833ax f263514c = C58836b.f156633a;

    public C94300ey(Image image) {
        this.f263513a = image;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88440a(int i, byte[] bArr, int i2, int i3) {
        Image.Plane plane = this.f263513a.getPlanes()[i];
        ByteBuffer buffer = plane.getBuffer();
        int position = buffer.position();
        int remaining = ((buffer.remaining() + plane.getRowStride()) - 1) / plane.getRowStride();
        int width = this.f263513a.getWidth() / (this.f263513a.getHeight() / remaining);
        int i4 = 0;
        for (int i5 = 0; i5 < remaining; i5++) {
            int i6 = i4;
            for (int i7 = 0; i7 < width; i7++) {
                bArr[i2] = buffer.get(i6);
                i2 += i3;
                i6 += plane.getPixelStride();
            }
            i4 += plane.getRowStride();
        }
        buffer.position(position);
    }

    /* renamed from: b */
    public final byte[] mo88441b() {
        if (this.f263514c.mo56113h()) {
            return (byte[]) this.f263514c.mo56107c();
        }
        int width = this.f263513a.getWidth() * this.f263513a.getHeight();
        int i = width / 4;
        byte[] bArr = new byte[(i + i + width)];
        Image.Plane[] planes = this.f263513a.getPlanes();
        Image image = this.f263513a;
        int width2 = image.getWidth() * image.getHeight();
        Image.Plane[] planes2 = image.getPlanes();
        ByteBuffer buffer = planes2[1].getBuffer();
        ByteBuffer buffer2 = planes2[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        boolean z = buffer2.remaining() == ((width2 + width2) / 4) + -2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planes[0].getBuffer().get(bArr, 0, width);
            ByteBuffer buffer3 = planes[1].getBuffer();
            planes[2].getBuffer().get(bArr, width, 1);
            buffer3.get(bArr, width + 1, ((width + width) / 4) - 1);
        } else {
            ((C59052c) ((C59052c) f263512b.mo56224b()).mo56372aa(14432)).mo56386p("YUV_420_888 image buffers are not in NV21 format");
            mo88440a(0, bArr, 0, 1);
            mo88440a(1, bArr, width + 1, 2);
            mo88440a(2, bArr, width, 2);
        }
        this.f263514c = C58833ax.m90834k(bArr);
        return bArr;
    }
}

package com.google.android.p10890h.p10891a.p10892a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.media3.common.C2646bh;
import com.evernote.android.state.BuildConfig;
import java.util.List;

/* renamed from: com.google.android.h.a.a.d */
/* compiled from: PG */
public final class C146549d implements C146552g {

    /* renamed from: a */
    private final C0320v f395773a;

    /* renamed from: b */
    private final String f395774b = BuildConfig.FLAVOR;

    public C146549d(C0320v vVar) {
        this.f395773a = vVar;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.os.Parcelable, java.lang.Object] */
    /* renamed from: a */
    public final MediaMetadataCompat mo115931a(C2646bh bhVar) {
        if (bhVar.mo6014u().mo6304o()) {
            return C146555j.f395775a;
        }
        C0329x xVar = new C0329x();
        if (bhVar.mo5989Q()) {
            xVar.mo1092c("android.media.metadata.ADVERTISEMENT", 1);
        }
        xVar.mo1092c("android.media.metadata.DURATION", (bhVar.mo6273as() || bhVar.mo6005l() == -9223372036854775807L) ? -1 : bhVar.mo6005l());
        long j = this.f395773a.mo1038f().f1003j;
        if (j != -1) {
            List i = this.f395773a.f1044a.mo866i();
            int i2 = 0;
            while (true) {
                if (i == null || i2 >= i.size()) {
                    break;
                }
                MediaSessionCompat.QueueItem queueItem = (MediaSessionCompat.QueueItem) i.get(i2);
                if (queueItem.f986b == j) {
                    MediaDescriptionCompat mediaDescriptionCompat = queueItem.f985a;
                    Bundle bundle = mediaDescriptionCompat.f938g;
                    if (bundle != null) {
                        for (String str : bundle.keySet()) {
                            Object obj = bundle.get(str);
                            if (obj instanceof String) {
                                xVar.mo1093d(this.f395774b.concat(String.valueOf(str)), (String) obj);
                            } else if (obj instanceof CharSequence) {
                                String concat = this.f395774b.concat(String.valueOf(str));
                                CharSequence charSequence = (CharSequence) obj;
                                if (!MediaMetadataCompat.f941a.containsKey(concat) || ((Integer) MediaMetadataCompat.f941a.get(concat)).intValue() == 1) {
                                    xVar.f1053a.putCharSequence(concat, charSequence);
                                } else {
                                    throw new IllegalArgumentException("The " + concat + " key cannot be used to put a CharSequence");
                                }
                            } else if (obj instanceof Long) {
                                xVar.mo1092c(this.f395774b.concat(String.valueOf(str)), ((Long) obj).longValue());
                            } else if (obj instanceof Integer) {
                                xVar.mo1092c(this.f395774b.concat(String.valueOf(str)), (long) ((Integer) obj).intValue());
                            } else if (obj instanceof Bitmap) {
                                xVar.mo1091b(this.f395774b.concat(String.valueOf(str)), (Bitmap) obj);
                            } else if (obj instanceof RatingCompat) {
                                String concat2 = this.f395774b.concat(String.valueOf(str));
                                RatingCompat ratingCompat = (RatingCompat) obj;
                                if (!MediaMetadataCompat.f941a.containsKey(concat2) || ((Integer) MediaMetadataCompat.f941a.get(concat2)).intValue() == 3) {
                                    xVar.f1053a.putParcelable(concat2, ratingCompat.mo826h());
                                } else {
                                    throw new IllegalArgumentException("The " + concat2 + " key cannot be used to put a Rating");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    CharSequence charSequence2 = mediaDescriptionCompat.f933b;
                    if (charSequence2 != null) {
                        String obj2 = charSequence2.toString();
                        xVar.mo1093d("android.media.metadata.TITLE", obj2);
                        xVar.mo1093d("android.media.metadata.DISPLAY_TITLE", obj2);
                    }
                    CharSequence charSequence3 = mediaDescriptionCompat.f934c;
                    if (charSequence3 != null) {
                        xVar.mo1093d("android.media.metadata.DISPLAY_SUBTITLE", charSequence3.toString());
                    }
                    CharSequence charSequence4 = mediaDescriptionCompat.f935d;
                    if (charSequence4 != null) {
                        xVar.mo1093d("android.media.metadata.DISPLAY_DESCRIPTION", charSequence4.toString());
                    }
                    Bitmap bitmap = mediaDescriptionCompat.f936e;
                    if (bitmap != null) {
                        xVar.mo1091b("android.media.metadata.DISPLAY_ICON", bitmap);
                    }
                    Uri uri = mediaDescriptionCompat.f937f;
                    if (uri != null) {
                        xVar.mo1093d("android.media.metadata.DISPLAY_ICON_URI", uri.toString());
                    }
                    String str2 = mediaDescriptionCompat.f932a;
                    if (str2 != null) {
                        xVar.mo1093d("android.media.metadata.MEDIA_ID", str2);
                    }
                    Uri uri2 = mediaDescriptionCompat.f939h;
                    if (uri2 != null) {
                        xVar.mo1093d("android.media.metadata.MEDIA_URI", uri2.toString());
                    }
                } else {
                    i2++;
                }
            }
        }
        return xVar.mo1090a();
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo115932b(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
        return C146551f.m238629a(mediaMetadataCompat, mediaMetadataCompat2);
    }
}

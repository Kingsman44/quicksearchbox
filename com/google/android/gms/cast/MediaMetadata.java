package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.cast.internal.p10776a.C143561b;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class MediaMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143363au();

    /* renamed from: a */
    public static final C143362at f388670a;

    /* renamed from: e */
    private static final String[] f388671e = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};

    /* renamed from: b */
    public final List f388672b;

    /* renamed from: c */
    public final Bundle f388673c;

    /* renamed from: d */
    public int f388674d;

    static {
        C143362at atVar = new C143362at();
        atVar.mo118515b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        atVar.mo118515b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        atVar.mo118515b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        atVar.mo118515b("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        atVar.mo118515b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        atVar.mo118515b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        atVar.mo118515b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        atVar.mo118515b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        atVar.mo118515b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f388670a = atVar;
    }

    public MediaMetadata() {
        this(0);
    }

    public MediaMetadata(List list, Bundle bundle, int i) {
        this.f388672b = list;
        this.f388673c = bundle;
        this.f388674d = i;
    }

    /* renamed from: f */
    public static void m232563f(String str) {
        if (!TextUtils.isEmpty(str)) {
            int a = f388670a.mo118514a(str);
            if (a != 1 && a != 0) {
                String str2 = f388671e[1];
                throw new IllegalArgumentException("Value for " + str + " must be a " + str2);
            }
            return;
        }
        throw new IllegalArgumentException("null and empty keys are not allowed");
    }

    /* renamed from: g */
    private final boolean m232564g(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m232564g((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String mo118414a(String str) {
        m232563f(str);
        return this.f388673c.getString(str);
    }

    /* renamed from: b */
    public final void mo118415b(WebImage webImage) {
        this.f388672b.add(webImage);
    }

    /* renamed from: c */
    public final void mo118416c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.f388673c.clear();
        this.f388672b.clear();
        this.f388674d = 0;
        try {
            this.f388674d = jSONObject2.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            C143561b.m233155c(this.f388672b, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.f388674d;
        if (i == 0) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 1) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 2) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"});
        } else if (i == 3) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"});
        } else if (i == 4) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"});
        } else if (i == 5) {
            Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE"});
        }
        Collections.addAll(arrayList, new String[]{"com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID"});
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C143362at atVar = f388670a;
                    String str = (String) atVar.f388820b.get(next);
                    if (str == null) {
                        Object obj = jSONObject2.get(next);
                        if (obj instanceof String) {
                            this.f388673c.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f388673c.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f388673c.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(str)) {
                        try {
                            Object obj2 = jSONObject2.get(next);
                            if (obj2 != null) {
                                int a = atVar.mo118514a(str);
                                if (a != 1) {
                                    if (a != 2) {
                                        if (a == 3) {
                                            double optDouble = jSONObject2.optDouble(next);
                                            if (!Double.isNaN(optDouble)) {
                                                this.f388673c.putDouble(str, optDouble);
                                            }
                                        } else if (a != 4) {
                                            if (a == 5) {
                                                this.f388673c.putLong(str, C143596v.m233270c(jSONObject2.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            String str2 = (String) obj2;
                                            if (C143561b.m233153a(str2) != null) {
                                                this.f388673c.putString(str, str2);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f388673c.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    this.f388673c.putString(str, (String) obj2);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    /* renamed from: d */
    public final void mo118417d(String str, String str2) {
        m232563f(str);
        this.f388673c.putString(str, str2);
    }

    /* renamed from: e */
    public final boolean mo118418e() {
        List list = this.f388672b;
        return list != null && !list.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMetadata)) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return m232564g(this.f388673c, mediaMetadata.f388673c) && this.f388672b.equals(mediaMetadata.f388672b);
    }

    public final int hashCode() {
        Bundle bundle = this.f388673c;
        int i = 17;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = this.f388673c.get(str);
                i = (i * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (i * 31) + this.f388672b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f388672b);
        C143947c.m234093l(parcel, 3, this.f388673c);
        C143947c.m234089h(parcel, 4, this.f388674d);
        C143947c.m234083b(parcel, a);
    }

    public MediaMetadata(int i) {
        this(new ArrayList(), new Bundle(), i);
    }
}

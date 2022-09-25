package org.chromium.net.p5647a;

import android.util.Log;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: org.chromium.net.a.h */
/* compiled from: PG */
public final class C72424h extends HttpURLConnection {

    /* renamed from: i */
    private static final String f192619i = "h";

    /* renamed from: a */
    public final C72429m f192620a = new C72429m();

    /* renamed from: b */
    public UrlRequest f192621b;

    /* renamed from: c */
    public final C72426j f192622c = new C72426j(this);

    /* renamed from: d */
    public C72427k f192623d;

    /* renamed from: e */
    public UrlResponseInfo f192624e;

    /* renamed from: f */
    public IOException f192625f;

    /* renamed from: g */
    public boolean f192626g;

    /* renamed from: h */
    public boolean f192627h;

    /* renamed from: j */
    private final CronetEngine f192628j;

    /* renamed from: k */
    private final List f192629k = new ArrayList();

    /* renamed from: l */
    private boolean f192630l;

    /* renamed from: m */
    private int f192631m;

    /* renamed from: n */
    private boolean f192632n;

    /* renamed from: o */
    private int f192633o;

    /* renamed from: p */
    private List f192634p;

    /* renamed from: q */
    private Map f192635q;

    public C72424h(URL url, CronetEngine cronetEngine) {
        super(url);
        this.f192628j = cronetEngine;
    }

    /* renamed from: f */
    private final int m107101f(String str) {
        for (int i = 0; i < this.f192629k.size(); i++) {
            if (((String) ((Pair) this.f192629k.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    private final List m107102g() {
        List list = this.f192634p;
        if (list != null) {
            return list;
        }
        this.f192634p = new ArrayList();
        for (Map.Entry entry : this.f192624e.getAllHeadersAsList()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.f192634p.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(this.f192634p);
        this.f192634p = unmodifiableList;
        return unmodifiableList;
    }

    /* renamed from: h */
    private final Map.Entry m107103h(int i) {
        try {
            m107105j();
            List g = m107102g();
            if (i >= g.size()) {
                return null;
            }
            return (Map.Entry) g.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: i */
    private final Map m107104i() {
        Map map = this.f192635q;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : m107102g()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(treeMap);
        this.f192635q = unmodifiableMap;
        return unmodifiableMap;
    }

    /* renamed from: j */
    private final void m107105j() {
        C72427k kVar = this.f192623d;
        if (kVar != null) {
            kVar.mo64121b();
            if (m107108m()) {
                this.f192623d.close();
            }
        }
        if (!this.f192627h) {
            m107107l();
            this.f192620a.mo64156a(0);
        }
        if (this.f192627h) {
            IOException iOException = this.f192625f;
            if (iOException != null) {
                throw iOException;
            } else if (this.f192624e == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            }
        } else {
            throw new IllegalStateException("No response.");
        }
    }

    /* renamed from: k */
    private final void m107106k(String str, String str2, boolean z) {
        if (!this.connected) {
            int f = m107101f(str);
            if (f >= 0) {
                if (z) {
                    this.f192629k.remove(f);
                } else {
                    throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
                }
            }
            this.f192629k.add(Pair.create(str, str2));
            return;
        }
        throw new IllegalStateException("Cannot modify request property after connection is made.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r6.f192630l != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r6.f192632n != false) goto L_0x00d2;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m107107l() {
        /*
            r6 = this;
            boolean r0 = r6.connected
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            org.chromium.net.CronetEngine r0 = r6.f192628j
            java.net.URL r1 = r6.getURL()
            java.lang.String r1 = r1.toString()
            org.chromium.net.a.g r2 = new org.chromium.net.a.g
            r2.<init>(r6)
            org.chromium.net.a.m r3 = r6.f192620a
            org.chromium.net.UrlRequest$Builder r0 = r0.newUrlRequestBuilder(r1, r2, r3)
            org.chromium.net.ExperimentalUrlRequest$Builder r0 = (org.chromium.net.ExperimentalUrlRequest.Builder) r0
            boolean r1 = r6.doOutput
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = r6.method
            java.lang.String r2 = "GET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = "POST"
            r6.method = r1
        L_0x002e:
            org.chromium.net.a.k r1 = r6.f192623d
            r2 = 0
            java.lang.String r3 = "Content-Length"
            if (r1 == 0) goto L_0x0061
            org.chromium.net.UploadDataProvider r1 = r1.mo64120a()
            org.chromium.net.a.m r4 = r6.f192620a
            r0.setUploadDataProvider((org.chromium.net.UploadDataProvider) r1, (java.util.concurrent.Executor) r4)
            java.lang.String r1 = r6.getRequestProperty(r3)
            if (r1 != 0) goto L_0x005b
            boolean r1 = r6.m107108m()
            if (r1 != 0) goto L_0x005b
            org.chromium.net.a.k r1 = r6.f192623d
            org.chromium.net.UploadDataProvider r1 = r1.mo64120a()
            long r4 = r1.getLength()
            java.lang.String r1 = java.lang.Long.toString(r4)
            r6.m107106k(r3, r1, r2)
        L_0x005b:
            org.chromium.net.a.k r1 = r6.f192623d
            r1.mo64122c()
            goto L_0x006c
        L_0x0061:
            java.lang.String r1 = r6.getRequestProperty(r3)
            if (r1 != 0) goto L_0x006c
            java.lang.String r1 = "0"
            r6.m107106k(r3, r1, r2)
        L_0x006c:
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = r6.getRequestProperty(r1)
            if (r3 != 0) goto L_0x0079
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r6.m107106k(r1, r3, r2)
        L_0x0079:
            java.util.List r1 = r6.f192629k
            java.util.Iterator r1 = r1.iterator()
        L_0x007f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            r0.addHeader((java.lang.String) r3, (java.lang.String) r2)
            goto L_0x007f
        L_0x0097:
            boolean r1 = r6.getUseCaches()
            if (r1 != 0) goto L_0x00a0
            r0.disableCache()
        L_0x00a0:
            java.lang.String r1 = r6.method
            r0.setHttpMethod((java.lang.String) r1)
            boolean r1 = r6.f192630l
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L_0x00ac
            goto L_0x00ba
        L_0x00ac:
            int r1 = android.net.TrafficStats.getThreadStatsTag()
            if (r1 == r2) goto L_0x00b6
            r6.f192631m = r1
            r6.f192630l = r3
        L_0x00b6:
            boolean r1 = r6.f192630l
            if (r1 == 0) goto L_0x00bf
        L_0x00ba:
            int r1 = r6.f192631m
            r0.setTrafficStatsTag(r1)
        L_0x00bf:
            boolean r1 = r6.f192632n
            if (r1 == 0) goto L_0x00c4
            goto L_0x00d2
        L_0x00c4:
            int r1 = android.net.TrafficStats.getThreadStatsUid()
            if (r1 == r2) goto L_0x00ce
            r6.f192633o = r1
            r6.f192632n = r3
        L_0x00ce:
            boolean r1 = r6.f192632n
            if (r1 == 0) goto L_0x00d7
        L_0x00d2:
            int r1 = r6.f192633o
            r0.setTrafficStatsUid(r1)
        L_0x00d7:
            org.chromium.net.ExperimentalUrlRequest r0 = r0.build()
            r6.f192621b = r0
            r0.start()
            r6.connected = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.p5647a.C72424h.m107107l():void");
    }

    /* renamed from: m */
    private final boolean m107108m() {
        return this.chunkLength > 0;
    }

    public final void addRequestProperty(String str, String str2) {
        m107106k(str, str2, false);
    }

    /* renamed from: b */
    public final void mo64131b(int i) {
        if (!this.connected) {
            this.f192630l = true;
            this.f192631m = i;
            return;
        }
        throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
    }

    public final void connect() {
        getOutputStream();
        m107107l();
    }

    public final void disconnect() {
        if (this.connected) {
            this.f192621b.cancel();
        }
    }

    public final InputStream getErrorStream() {
        try {
            m107105j();
            if (this.f192624e.getHttpStatusCode() >= 400) {
                return this.f192622c;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getHeaderField(int i) {
        Map.Entry h = m107103h(i);
        if (h == null) {
            return null;
        }
        return (String) h.getValue();
    }

    public final String getHeaderFieldKey(int i) {
        Map.Entry h = m107103h(i);
        if (h == null) {
            return null;
        }
        return (String) h.getKey();
    }

    public final Map getHeaderFields() {
        try {
            m107105j();
            return m107104i();
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    public final InputStream getInputStream() {
        m107105j();
        if (!this.instanceFollowRedirects && this.f192626g) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.f192624e.getHttpStatusCode() < 400) {
            return this.f192622c;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    public final OutputStream getOutputStream() {
        if (this.f192623d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (m107108m()) {
                this.f192623d = new C72420d(this.chunkLength, this.f192620a);
                m107107l();
            } else {
                long j = (long) this.fixedContentLength;
                if (this.fixedContentLengthLong != -1) {
                    j = this.fixedContentLengthLong;
                }
                if (j != -1) {
                    this.f192623d = new C72422f(j, this.f192620a);
                    m107107l();
                } else {
                    Log.d(f192619i, "Outputstream is being buffered in memory.");
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.f192623d = new C72418b();
                    } else {
                        this.f192623d = new C72418b(Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f192623d;
    }

    public final Map getRequestProperties() {
        if (!this.connected) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Pair pair : this.f192629k) {
                if (!treeMap.containsKey(pair.first)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pair.second);
                    treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
                } else {
                    throw new IllegalStateException("Should not have multiple values.");
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }
        throw new IllegalStateException("Cannot access request headers after connection is set.");
    }

    public final String getRequestProperty(String str) {
        int f = m107101f(str);
        if (f >= 0) {
            return (String) ((Pair) this.f192629k.get(f)).second;
        }
        return null;
    }

    public final int getResponseCode() {
        m107105j();
        return this.f192624e.getHttpStatusCode();
    }

    public final String getResponseMessage() {
        m107105j();
        return this.f192624e.getHttpStatusText();
    }

    public final void setConnectTimeout(int i) {
        Log.d(f192619i, "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    public final void setRequestProperty(String str, String str2) {
        m107106k(str, str2, true);
    }

    public final boolean usingProxy() {
        return false;
    }

    public final String getHeaderField(String str) {
        try {
            m107105j();
            Map i = m107104i();
            if (!i.containsKey(str)) {
                return null;
            }
            List list = (List) i.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }
}
